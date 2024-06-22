package Logico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//daclaro los datos que voy a usar en el "connection"
public class Conexion {

    public String db = "hotel";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String contra = "asper1409";

    public Conexion() {
    }

    //aqui se genera la conexion a mi base de datos
    public Connection conectar() {

        Connection link = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");//direccion de la clase driver
            link = DriverManager.getConnection(this.url, this.user, this.contra); //aqui lo conecto
        } catch (ClassNotFoundException | SQLException e) {
            //en caso de errores aqui se muestra
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de datos");
        }

        return link; // aqui retorno el link 
    }

}
