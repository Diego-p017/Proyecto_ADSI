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
public class GestorMedico {
    private static LinkedList<Medico> Medico;
     Connection con;
     Conexion conectar = new Conexion();
     
     PreparedStatement pst;
    public GestorMedico(){
        Medico=new LinkedList<Medico>();
    }
    
   public void RegistrarMedico(Medico medico){
  
        //PreparedStatement pst;
        try {
            con = conectar.getConnection();
            pst = con.prepareStatement("insert into medicos values(?,?,?)");
            pst.setString(1,medico.getMedIdentificacion());
            pst.setString(2,medico.getMedNombre());
            pst.setString(3,medico.getMedApellido());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Medico Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Medico.add(medico);
    }
   
   /*
    public LinkedList<Medico> getMedicobyParametro(int parametro, String valor){
      con = conectar.getConnection();
        LinkedList<Medico> resultado=new LinkedList<Paciente>();
        String sql="";
        for(Paciente pac:pacientes){
           switch(parametro){
               
            case 1: if(pac.getIdentificacion().equals(valor)){
                sql = "select * from pacientes where PacIdentificacion='"+valor+"'";
                
                resultado.add(pac);}
            break;
        
            case 2: if(pac.getNombres().equals(valor)){
                sql = "select * from pacientes where PacNombre='"+valor+"'";
                resultado.add(pac);}
            break;
        
            case 3: if(pac.getApellidos().equals(valor)){
                 sql = "select * from pacientes where PacApellido='"+valor+"'";
                 resultado.add(pac);}
            break;
        
            case 4: if(pac.getGenero().equals(valor)){
                sql = "select * from pacientes where PacSexo='"+valor+"'";
                resultado.add(pac);}
            break;

    }
   }
          try(Statement st = con.createStatement() ){
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                resultado.add(new Paciente(rs.getString("PacIdentificacion"),rs.getString("PacNombre"),rs.getString("PacApellido"),rs.getString("PacFechaNacimiento"),rs.getString("PacSexo") ));
            }
            st.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
  }
*/
}