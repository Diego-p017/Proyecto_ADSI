
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MedicoControl implements ActionListener {
   Vista.RegMedico MedicoVista;
   Modelo.Medico MedicoModelo;
   Modelo.GestorMedico gestorMedicoModelo;
 
    public MedicoControl(Vista.RegMedico MedicoVista){
         this.MedicoVista = MedicoVista;
         gestorMedicoModelo=new Modelo.GestorMedico();
    }
@Override
public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(MedicoVista.BtnRegistrar)){
         String identificacion=MedicoVista.txt_identificacion.getText();
         String nombres=MedicoVista.txt_nombres.getText();
         String apellidos=MedicoVista.txt_apellidos.getText();
         MedicoModelo = new Modelo.Medico(identificacion,nombres,apellidos);
         gestorMedicoModelo.RegistrarMedico(MedicoModelo);
        }
    
    if(e.getSource().equals(MedicoVista.BtnNuevo)){
    MedicoVista.txt_identificacion.setText("");
    MedicoVista.txt_nombres.setText("");
    MedicoVista.txt_apellidos.setText("");
    MedicoVista.txt_identificacion.requestFocus();
    }
  }
}


