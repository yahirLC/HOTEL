package Logico;

import Base.Dcuarto;
import java.io.FileInputStream;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Lcuarto {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "NO.CUARTO", "PISO", "DESCRIPCION", "CARACTERISTICAS", "PRECIOXDOA", "ESTADO", "TIPO","NOIMAGEN"};
        String[] registro = new String[9];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from cuarto where piso like '%" + buscar + "%' order by idCuarto";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idCuarto");
                registro[1] = rs.getString("numero");
                registro[2] = rs.getString("piso");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("precio_diario");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipocuarto");
                
                registro[8] = rs.getString("nomimagen");
                
                
                totalregistros++;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar");
            return null;

        }

    }

    public DefaultTableModel mostrar(String buscar, String T) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "NO.CUARTO", "PISO", "DESCRIPCION", "CARACTERISTICAS", "PRECIOXDOA", "ESTADO", "TIPO"};
        String[] registro = new String[9];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from cuarto where piso like '%" + buscar + "%' and estado ='Disponible' order by idCuarto";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idCuarto");
                registro[1] = rs.getString("numero");
                registro[2] = rs.getString("piso");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("precio_diario");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipocuarto");
                

                totalregistros++;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar");
            return null;

        }

    }

    public boolean insertar(Dcuarto dts) {
        sSQL = "insert into cuarto(numero,piso,descripcion,caracteristicas,precio_diario,estado,tipocuarto,nomimagen,imagen)" + "values (?,?,?,?,?,?,?,?,?)";

        try {
            
            FileInputStream archivofoto;
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipocuarto());
            pst.setString(8,dts.getNomimagen());
            
            archivofoto = new FileInputStream(dts.getNomimagen());
            
            pst.setBinaryStream(9,archivofoto);
            

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

    public boolean editar(Dcuarto dts) {
        sSQL = "update cuarto set numero=?, piso=?,descripcion=?,caracteristicas=?,precio_diario=?,estado=?,tipocuarto=?,nomimagen=?,imagen=?"
                + "where idCuarto=?";
        try {
            FileInputStream archivofoto;
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipocuarto());
            
            pst.setString(8,dts.getNomimagen());
            
            archivofoto = new FileInputStream(dts.getNomimagen());
            
            pst.setBinaryStream(9,archivofoto);
            
            
            pst.setInt(10, dts.getIdCuarto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean ocupar(Dcuarto dts) {
        sSQL = "update cuarto set estado='Ocupado'"
                + "where idCuarto=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdCuarto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean desocupar(Dcuarto dts) {
        sSQL = "update cuarto set estado='Disponible'"
                + "where idCuarto=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdCuarto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dcuarto dts) {
        sSQL = "delete from cuarto where idCuarto=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdCuarto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public float obtenerPrecioDiarioPorId(String idCuarto) {
    float precioDiario = 0;
    String sSQL = "SELECT precio_diario FROM hotel.cuarto WHERE numero = "+idCuarto+"";

    try {
        PreparedStatement pst = cn.prepareStatement(sSQL);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            precioDiario = rs.getFloat("precio_diario");
            
        }

        return precioDiario;
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, "No se pudo obtener el precio diario");
        return 0;
    }
}

}
