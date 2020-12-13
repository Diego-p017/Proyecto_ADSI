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
public class GestorConsultorio {
    private static LinkedList<Consultorio> Consultorio;
     Connection con;
     Conexion conectar = new Conexion();
     
     PreparedStatement pst;
    public GestorConsultorio(){
        Consultorio=new LinkedList<Consultorio>();
    }
    
   public void RegistrarConsultorio(Consultorio consultorio){
  
        //PreparedStatement pst;
        try {
            con = conectar.getConnection();
            pst = con.prepareStatement("insert into consultorios values(?,?)");
            pst.setString(1,consultorio.getIdConsultorio());
            pst.setString(2,consultorio.getNombreConsultorio());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Consultorio Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorConsultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Consultorio.add(consultorio);
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