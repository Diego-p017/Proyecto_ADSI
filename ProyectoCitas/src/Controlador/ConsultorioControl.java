
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConsultorioControl implements ActionListener {
   Vista.RegConsultorio ConsultorioVista;
   Modelo.Consultorio ConsultorioModelo;
   Modelo.GestorConsultorio gestorConsultorioModelo;
 
    public ConsultorioControl(Vista.RegConsultorio ConsultorioVista){
         this.ConsultorioVista = ConsultorioVista;
         gestorConsultorioModelo=new Modelo.GestorConsultorio();
    }
@Override
public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(ConsultorioVista.BtnRegistrar)){
         String idConsultorio= ConsultorioVista.txt_idConsultorio.getText();
         String nombreConsultorio= ConsultorioVista.txt_nombreConsultorio.getText();
         ConsultorioModelo = new Modelo.Consultorio(idConsultorio,nombreConsultorio);
         gestorConsultorioModelo.RegistrarConsultorio(ConsultorioModelo);
        }
    
    if(e.getSource().equals(ConsultorioVista.BtnNuevo)){
    ConsultorioVista.txt_idConsultorio.setText("");
    ConsultorioVista.txt_nombreConsultorio.setText("");
    }
  }
}


