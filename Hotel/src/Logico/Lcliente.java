package Logico;

import Base.Dcliente;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

public class Lcliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "NOMBRE", "PATERNO", "MATERNO", "F_NACIMIENTO", "TELEFONO", "CORREO", "NO_CLIENTE"};
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.nombre,p.a_paterno,p.a_materno,p.fecha_nacimiento,p.telefono,p.correo,c.CodigoCliente from persona p inner join cliente c on p.idPersona=c.idPersona WHERE (p.nombre LIKE '%" + buscar + "%' OR p.a_paterno LIKE '%" + buscar + "%' OR p.a_materno LIKE '%" + buscar + "%' OR p.fecha_nacimiento LIKE '%" + buscar + "%' OR p.telefono LIKE '%" + buscar + "%' OR p.correo LIKE '%" + buscar + "%') AND c.ClienteStatus = 0 order by idPersona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idPersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("a_paterno");
                registro[3] = rs.getString("a_materno");
                registro[4] = rs.getString("fecha_nacimiento");
                registro[5] = rs.getString("telefono");
                registro[6] = rs.getString("correo");
                registro[7] = rs.getString("CodigoCliente");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los clientes");
            return null;
        }

    }

    
     public DefaultTableModel mostrar(String buscar,int a) {
         
        a = 2;
         
        DefaultTableModel modelo;

        String[] titulos = {"ID", "NOMBRE", "PATERNO", "MATERNO", "F_NACIMIENTO", "TELEFONO", "CORREO", "NO_CLIENTE"};
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.nombre,p.a_paterno,p.a_materno,p.fecha_nacimiento,p.telefono,p.correo,c.CodigoCliente from persona p inner join cliente c on p.idPersona=c.idPersona WHERE (p.nombre LIKE '%" + buscar + "%' OR p.a_paterno LIKE '%" + buscar + "%' OR p.a_materno LIKE '%" + buscar + "%' OR p.fecha_nacimiento LIKE '%" + buscar + "%' OR p.telefono LIKE '%" + buscar + "%' OR p.correo LIKE '%" + buscar + "%') AND c.ClienteStatus = 1 order by idPersona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("idPersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("a_paterno");
                registro[3] = rs.getString("a_materno");
                registro[4] = rs.getString("fecha_nacimiento");
                registro[5] = rs.getString("telefono");
                registro[6] = rs.getString("correo");
                registro[7] = rs.getString("CodigoCliente");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los clientes");
            return null;
        }

    }
    public boolean insertar(Dcliente dts) {

        sSQL = "insert into persona(nombre,a_paterno,a_materno,fecha_nacimiento,telefono,correo,personastatus) values (?,?,?,?,?,?,0)";
        sSQL2 = "insert into cliente(idPersona,CodigoCliente,ClienteStatus) values ((select idPersona from persona order by idPersona desc limit 1),?,0)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getA_paterno());
            pst.setString(3, dts.getA_materno());
            pst.setString(4, dts.getFecha_nacimiento());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getCorreo());

            pst2.setString(1, dts.getNocliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {

                return false;
            }

        } catch (SQLIntegrityConstraintViolationException e) {

            JOptionPane.showMessageDialog(null, "DATO REPETIDO EN LA BASE DE DATOS");
            return false;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dcliente dts) {
        sSQL = "update persona set nombre=?, a_paterno=?,a_materno=?,fecha_nacimiento=?,telefono=?,correo=?"
                + "where idPersona=?";

        sSQL2 = "update cliente set CodigoCliente=?"
                + "where idPersona=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getA_paterno());
            pst.setString(3, dts.getA_materno());
            pst.setString(4, dts.getFecha_nacimiento());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getCorreo());
            pst.setInt(7, dts.getIdPersona());

            pst2.setString(1, dts.getNocliente());
            pst2.setInt(2, dts.getIdPersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {

                return false;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dcliente dts) {
        sSQL = "update cliente set ClienteStatus = 1 where idPersona=?";
        sSQL2 = "update persona set personastatus = 1 where idPersona=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdPersona());
            pst2.setInt(1, dts.getIdPersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {

                return false;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

        public boolean restaurar(Dcliente dts) {
    String sSQL = "update cliente set ClienteStatus = 0 where CodigoCliente=?";
    try {
        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, dts.getNocliente());
        
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

    
    public int reciente() {
        int recienteCliente = 0;
        String sSQL = "SELECT MAX(CodigoCliente) as reciente FROM hotel.cliente";

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

}
