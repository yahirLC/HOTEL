package Logico;

import Base.Dtrabajador;
import Base.Dcliente;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Ltrabajador {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "NOMBRE", "PATERNO", "MATERNO", "F_NACIMIENTO", "TELEFONO", "CORREO", "LOGIN", "CONTRASEÑA", "ACCESO", "SUELDO"};
        String[] registro = new String[11];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idPersona,p.nombre,p.a_paterno,p.a_materno,p.fecha_nacimiento,p.telefono,p.correo,t.login,t.contraseña,t.acceso,t.sueldo from persona p inner join trabajador t on p.idPersona=t.idPersona where a_paterno like '%" + buscar + "%' order by idPersona desc";

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
                registro[7] = rs.getString("login");
                registro[8] = rs.getString("contraseña");
                registro[9] = rs.getString("acceso");
                registro[10] = rs.getString("sueldo");

                totalregistros++;

                modelo.addRow(registro);

            }

            return modelo;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "No se pudo mostrar los clientes");
            return null;
        }

    }

    public boolean insertar(Dtrabajador dts) {

        sSQL = "insert into persona(nombre,a_paterno,a_materno,fecha_nacimiento,telefono,correo) values (?,?,?,?,?,?)";
        sSQL2 = "insert into trabajador(idPersona,login,contraseña,acceso,sueldo) values ((select idPersona from persona order by idPersona desc limit 1),?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getA_paterno());
            pst.setString(3, dts.getA_materno());
            pst.setString(4, dts.getFecha_nacimiento());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getCorreo());

            pst2.setString(1, dts.getLogin());
            pst2.setString(2, dts.getContra());
            pst2.setString(3, dts.getAcceso());
            pst2.setDouble(4, dts.getSueldo());

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

    public boolean editar(Dtrabajador dts) {
        sSQL = "update persona set nombre=?, a_paterno=?,a_materno=?,fecha_nacimiento=?,telefono=?,correo=?"
                + "where idPersona=?";

        sSQL2 = "update trabajador set login=?,contraseña=?,acceso=?,sueldo=?"
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

            pst2.setString(1, dts.getLogin());
            pst2.setString(2, dts.getContra());
            pst2.setString(3, dts.getAcceso());
            pst2.setDouble(4, dts.getSueldo());
            pst2.setInt(5, dts.getIdPersona());

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

    public boolean eliminar(Dtrabajador dts) {
        sSQL = "delete from trabajador where idPersona=?";
        sSQL2 = "delete from persona where idPersona=?";

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

}
