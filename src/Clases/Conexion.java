package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    String ip="localhost";
    String bd = "tienda";
    String url="jdbc:mysql://127.0.0.1:3306/tienda";
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        Connection link = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
   
}
