package Logico;

import Base.Dreserva;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Lreserva {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IDCUARTO", "NUMERO", "IDCLIENTE", "CLIENTE", "IDTRABAJADOR", "TRABAJADOR", "FECHA_R", "FECHA_E", "FECHA_S", "COSTO", "ESTADO", "TIPO"};
        String[] registro = new String[13];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select r.idReservacion,r.idCuarto,c.numero,r.idCliente,"
                + "(select nombre from persona where idPersona=cl.idPersona)as clientenombre,"
                + "(select a_paterno from persona where idPersona=cl.idPersona)as clientepaterno,"
                + "r.idTrabajador,"
                + "(select nombre from persona where idPersona=r.idTrabajador)as trabajadornombre,"
                + "(select a_paterno from persona where idPersona=r.idTrabajador)as trabajadorpaterno,"
                + "r.fecha_reservacion, r.fecha_ingreso, r.fecha_salida, r.costo_total, r.estado,r.tipo from reservacion r inner join cuarto c on r.idCuarto=c.idCuarto inner  join cliente cl on r.idCliente = cl.CodigoCliente where r.fecha_reservacion like '%" + buscar + "%' order by idReservacion desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idReservacion");
                registro[1] = rs.getString("idCuarto");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idCliente");
                registro[4] = rs.getString("clientenombre") + " " + rs.getString("clientepaterno");
                registro[5] = rs.getString("idTrabajador");
                registro[6] = rs.getString("trabajadornombre") + "" + rs.getString("trabajadorpaterno");
                registro[7] = rs.getString("fecha_reservacion");
                registro[8] = rs.getString("fecha_ingreso");
                registro[9] = rs.getString("fecha_salida");
                registro[10] = rs.getString("costo_total");
                registro[11] = rs.getString("estado");
                registro[12] = rs.getString("tipo");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los clientes");
            return null;
        }

    }

    public boolean insertar(Dreserva dts) {

        sSQL = "insert into reservacion(idCuarto,idCliente,idTrabajador,fecha_reservacion,fecha_ingreso,fecha_salida,costo_total,estado,tipo) values (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdCuarto());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getFecha_reservacion());
            pst.setString(5, dts.getFecha_ingreso());
            pst.setString(6, dts.getFecha_salida());
            pst.setDouble(7, dts.getCosto_total());
            pst.setString(8, dts.getEstado());
            pst.setString(9, dts.getTipo());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dreserva dts) {
        sSQL = "update reservacion set idCuarto=?, idCliente=?,idTrabajador=?,Fecha_reservacion=?,Fecha_ingreso=?,Fecha_salida=?,Costo_total=?,estado=?,tipo=?"
                + "where idReservacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdCuarto());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdTrabajador());
            pst.setString(4, dts.getFecha_reservacion());
            pst.setString(5, dts.getFecha_ingreso());
            pst.setString(6, dts.getFecha_salida());
            pst.setDouble(7, dts.getCosto_total());
            pst.setString(8, dts.getEstado());
            pst.setString(9, dts.getTipo());
            pst.setString(10, dts.getIdReservacion());

            int n = pst.executeUpdate();

            if (n != 0) {

                return true;

            } else {

                return false;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean pagar(Dreserva dts) {
        sSQL = "update reservacion set estado='PAGADO'"
                + "where idReservacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getIdReservacion());

            int n = pst.executeUpdate();
            if (n != 0) {

                return true;

            } else {

                return false;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dreserva dts) {
        sSQL = "delete from reservacion where idReservacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getIdReservacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {

                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO ES POSIBLE ELIMINAR\n"
                    + "ESTA RESERVACION YA HA SIDO PAGADA "
                    + "Y PERTENECE AL HISTORIAL");
            return false;
        }
    }

}
