package Logico;

import Base.Dpago;
import Trabajador.Pago;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Lpago {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IDPAGO", "TIPO", "MONTO", "IDRESERVACION", "F_PAGO", "IVA","TOTAL"};
        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from pago where idReservacion=" + buscar + " order by idPago desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idPago");//1
                registro[1] = rs.getString("tipo");//2
                registro[2] = rs.getString("monto");//3
                registro[3] = rs.getString("idReservacion");//4
                registro[4] = rs.getString("fecha_pago");//5
                registro[5] = rs.getString("iva");//7
                registro[6] = rs.getString("total");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (SQLException e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los pagos");
            return null;
        }

    }

    public DefaultTableModel mostrar() {
        DefaultTableModel modelo;

        String[] titulos = {"IDPAGO", "TIPO", "MONTO", "IDRESERVACION", "F_PAGO", "IVA","TOTAL"};
        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from pago order by idPago desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idPago");//1
                registro[1] = rs.getString("tipo");//2
                registro[2] = rs.getString("monto");//3
                registro[3] = rs.getString("idReservacion");//4
                registro[4] = rs.getString("fecha_pago");//5
                registro[5] = rs.getString("iva");//7
                registro[6] = rs.getString("total");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (SQLException e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los pagos");
            return null;
        }

    }

    
    public boolean insertar(Dpago dts) {

        sSQL = "insert into pago(idReservacion,tipo,monto,fecha_pago,iva,total) values (?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdReservacion());
            pst.setString(2, dts.getTipo());
            pst.setDouble(3, dts.getMonto());
            pst.setString(4, dts.getFecha_pago());
            pst.setDouble(5, dts.getIva());
            pst.setFloat(6, dts.getTotal());

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

    public boolean editar(Dpago dts) {
        sSQL = "update pago set idReservacion = ?, tipo= ?,monto = ?, idReservacion = ?, fecha_pago=?, no_comprobante= ?, iva = ?"
                + "where idPago=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdReservacion());
            pst.setString(2, dts.getTipo());
            pst.setDouble(3, dts.getMonto());
            pst.setInt(4, dts.getIdReservacion());
            pst.setString(5, dts.getFecha_pago());
            pst.setDouble(6, dts.getIva());
            pst.setInt(7, dts.getIdPago());

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

    public boolean eliminar(Dpago dts) {
        sSQL = "delete from pago where idPago=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdPago());

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

    public DefaultTableModel login(String logini, String contraseñai) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "NOMBRE", "PATERNO", "MATERNO", "LOGIN", "CONTRASEÑA", "ACCESO"};
        String[] registro = new String[7];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.nombre,p.a_paterno,p.a_materno,t.login,t.contraseña,t.acceso from persona p inner join trabajador t on p.idPersona=t.idPersona where t.login='" + logini + "' and t.contraseña='" + contraseñai + "'";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idPersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("a_paterno");
                registro[3] = rs.getString("a_materno");
                registro[4] = rs.getString("login");
                registro[5] = rs.getString("contraseña");
                registro[6] = rs.getString("acceso");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "No se pudo iniciar sesion, verifique sus datos");
            return null;
        }

    }

     public int reciente() {
        int recienteCliente = 0;
        String sSQL = "SELECT MAX(idPago) as reciente FROM hotel.pago";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            if (rs.next()) {
                recienteCliente = rs.getInt("reciente");
            }

            return recienteCliente;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se pudo obtener el cliente más reciente");
            return 0;
        }
    }
     
    public void Restantes(String idReserva) {
        String idCuarto = null;
        String NoCuarto = null;
        String ClienteNombre = null;

        String sSQL = "sELECT r.idCuarto, c.numero AS NoCuarto, (SELECT CONCAT(nombre, ' ', a_paterno) FROM persona WHERE idPersona = cl.idPersona) AS ClienteNombre FROM reservacion r INNER JOIN cuarto c ON r.idCuarto = c.idCuarto INNER JOIN cliente cl ON r.idCliente = cl.CodigoCliente WHERE r.idReservacion = '"+idReserva+"'";

        try (Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sSQL)) {
            if (rs.next()) {
                idCuarto = rs.getString("idCuarto");
                NoCuarto = rs.getString("NoCuarto");
                ClienteNombre = rs.getString("ClienteNombre");
                
                Pago.nocuarto = NoCuarto;
                Pago.idcuarto = idCuarto;
                Pago.nombrecliente = ClienteNombre;
        
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos: " + e.getMessage());
        }
    }
}
