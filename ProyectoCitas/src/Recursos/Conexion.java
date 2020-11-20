
package Recursos;

/** 
 * @author AustiinTellez
 */

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    String url="jdbc:mysql://localhost:3306/citas2020";
    String user="root",pass="";
    Connection con;
    public Connection getConnection(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           JOptionPane.showMessageDialog(null,"conexion a la base de datos");
        }  catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR conexion a la base de datos");
        }
          return con;
    }
}
