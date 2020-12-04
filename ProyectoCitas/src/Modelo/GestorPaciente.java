package Modelo;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Recursos.Conexion;
/**
*
* @author Usuario
*/
public class GestorPaciente {
    private static LinkedList<Paciente> pacientes;
     Connection con;
     Conexion conectar = new Conexion();
     
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
    public static void getPacientebyParametro(int parametro, String valor){
        LinkedList<Paciente> resultado=new LinkedList<Paciente>();
        
    for(Paciente pac:pacientes){
           switch(parametro){
        case 1: if(pac.getIdentificacion().equals(valor)){
        resultado.add(pac);}
        break;
        
        case 2: if(pac.getNombres().equals(valor)){
        resultado.add(pac);}
        break;
        
        case 3: if(pac.getApellidos().equals(valor)){
        resultado.add(pac);}
        break;
        
        case 4: if(pac.getGenero().equals(valor)){
        resultado.add(pac);}
        break;

    }
   }
  }
}