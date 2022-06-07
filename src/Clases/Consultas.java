package Clases;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Consultas {
    Conexion mysql= new Conexion();
    Connection cn = mysql.Conectar();
    String sSQL="";
   
    public void enviar_datos(String documento,String nombre)
    {
        sSQL="INSERT INTO cliente(documento, nombre)VALUES (?,?) ";
        try {
                PreparedStatement pat= cn.prepareStatement(sSQL);
                pat.setString(1, documento); 
                pat.setString(2, nombre); 
                pat.executeUpdate();    
                JOptionPane.showMessageDialog(null, "Dato Guardado");
        }
    catch (SQLException ex){ {System.out.println(ex);
    JOptionPane.showMessageDialog(null, "Error "+"\n"+"Vuelva a intentarlo","Error" , JOptionPane.INFORMATION_MESSAGE);}}
    }
}