
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.SimpleDateFormat;

public class PacienteControl implements ActionListener {
   Vista.RegPaciente pacienteVista;
   Modelo.Paciente pacienteModelo;
   Modelo.GestorPaciente gestorpacienteModelo;
 
    public PacienteControl(Vista.RegPaciente pacienteVista){
         this.pacienteVista=pacienteVista;
         gestorpacienteModelo=new Modelo.GestorPaciente();
    }
@Override
public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(pacienteVista.BtnRegistrar)){
         String identificacion=pacienteVista.txt_identificacion.getText();
         String nombres=pacienteVista.txt_nombres.getText();
         String apellidos=pacienteVista.txt_apellidos.getText();
         SimpleDateFormat formato=new SimpleDateFormat("dd/mm/yyyy");
         String FechaNacimiento=formato.format(pacienteVista.Dtd_fecha_nacimiento.getDate());
         String genero="";
         if(pacienteVista.rdb_masculino.isSelected()){
         genero="M";
         }
         if(pacienteVista.rdb_femenino.isSelected()){
         genero="F";
         }
         pacienteModelo = new Modelo.Paciente(identificacion,nombres,apellidos,FechaNacimiento,genero);
         gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
        }
    
    if(e.getSource().equals(pacienteVista.BtnNuevo)){
    pacienteVista.txt_identificacion.setText("");
    pacienteVista.txt_nombres.setText("");
    pacienteVista.txt_apellidos.setText("");
    pacienteVista.Dtd_fecha_nacimiento.setDate(null);
    pacienteVista.rdb_masculino.setSelected(true);
    pacienteVista.rdb_femenino.setSelected(false);
    pacienteVista.txt_identificacion.requestFocus();
    }
  }
}


