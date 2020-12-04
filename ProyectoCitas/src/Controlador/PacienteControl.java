
package Controlador;

/**
 * @author AustiinTellez
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PacienteControl  implements ActionListener{
    
    Vista.RegPaciente pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente GestorPacienteModelo;

    public PacienteControl(Vista.RegPaciente pacienteVista){

    this.pacienteVista = pacienteVista;
    GestorPacienteModelo = new Modelo.GestorPaciente();
    
}

 @Override
 public void actionPerformed(ActionEvent e){
     if(e.getSource().equals(pacienteVista.BtnRegistrar)){
         
         String PacIdentificacion = pacienteVista.TxtID.getText();
         String PacNombre = pacienteVista.TxtNombre.getText();
         String PacApellido = pacienteVista.TxtApellidos.getText();
        // DateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        // String fechaNacimiento = formato.format (pacienteVista.DbdFechaNaci);
          SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd");
         String PacfechaNacimiento=formato.format(pacienteVista.DbdFechaNaci.getDate());
         String PacSexo = "";
            if(pacienteVista.RdbM.isSelected()){
                PacSexo = "M";
            }
            if(pacienteVista.RdbF.isSelected()){
                PacSexo = "F";
            }
            
        pacienteModelo = new Modelo.Paciente(  PacIdentificacion,
        PacNombre,
        PacApellido,
        PacfechaNacimiento,
        PacSexo);
           GestorPacienteModelo.RegistrarPacientes(pacienteModelo);            
     }
     
     if(e.getSource().equals(pacienteVista.BtnNuevo)){
         pacienteVista.TxtID.setText("");
         pacienteVista.TxtNombre.setText("");
         pacienteVista.TxtApellidos.setText("");
         pacienteVista.DbdFechaNaci.setDate(null);
         pacienteVista.RdbM.setSelected(true);
         pacienteVista.RdbF.setSelected(false);
         pacienteVista.TxtID.requestFocus();
     }
 }
 
 
 
 
 
}
