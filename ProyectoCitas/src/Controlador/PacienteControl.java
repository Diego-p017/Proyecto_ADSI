
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
         
         Int id = pacienteVista.TxtID.getText();
         String nombres = pacienteVista.TxtNombre.getText();
         String apellidos = pacienteVista.TxtApellidos.getText();
         DateFormat formato = new SimpleDateFormat("yyy-MM-dd");
         String fechaNacimiento = formato.format (pacienteVista.DbdFechaNaci);
         String genero = "";
            if(pacienteVista.RdbM.isSelected()){
                genero = "M";
            }
            if(pacienteVista.RdbF.isSelected()){
                genero = "F";
            }
            
        pacienteModelo = new Modelo.Paciente(id,nombres,apellidos,fechaNacimiento,genero);
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
