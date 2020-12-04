

package Modelo;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GestorPaciente {
    private static LinkedList<Paciente> pacientes; 
    Connection con;
     Conexion conectar = new Conexion ();
     
     public GestorPaciente(){
         pacientes = new LinkedList<Paciente>();
     }
     
     public void RegistrarPacientes(Paciente paciente){
         
         PreparedStatement pst;
         try {
             con = conectar.getConnection();
             pst = con.prepareStatement("insert into pacientes values(?,?,?,?,?)");
             pst.setString(1,paciente.getIdentificacion());
             pst.setString(2,paciente.getNombres());
             pst.setString(3,paciente.getApellidos());
             pst.setString(4,paciente.getFechaNacimiento());
             pst.setString(5,paciente.getGenero());
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Paciente REgistrado");                     
         } catch (SQLException ex){
             Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
          pacientes.add(paciente);
     }
     
    // public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor){
     //    LinkedList<Paciente> resultado = new LinkedList<Paciente>();
       //  String sql="";
     //}
     
    
    
    
}