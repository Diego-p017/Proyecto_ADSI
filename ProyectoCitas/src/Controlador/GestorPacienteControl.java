
package Controlador;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Austiin Tellez
 */
public class GestorPacienteControl implements ActionListener{
    Modelo.GestorPaciente pacientesModelo;
    Vista.ConsPaciente consultarPacienteVista;
    
    public GestorPacienteControl(Vista.ConsPaciente consultarPacienteVista){
        this.consultarPacienteVista=consultarPacienteVista;
        pacientesModelo=new Modelo.GestorPaciente();
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        DefaultTableModel tmodelo;
        String valor=consultarPacienteVista.txt_valor.getText();
        System.out.println("valor ="+valor);
        int parametro=0;
        
        
        if(consultarPacienteVista.rdb_identificacion.isSelected()){
            parametro=1;
             System.out.println("parametro ="+parametro);
           }
        if(consultarPacienteVista.rdb_nombres.isSelected()){
            parametro=2;
           }
        if(consultarPacienteVista.rdb_apellidos.isSelected()){
            parametro=3;
           }
        if(consultarPacienteVista.rdb_genero.isSelected()){
            parametro=4;
        }
        
        LinkedList<Modelo.Paciente> pacientes=pacientesModelo.getPacientebyParametro(parametro, valor);
        String registro[] = new String[5];
        
        String []Titulos = {"Identificacion","Nombre","Apellido","Fecha Nacimiento","Genero"};

         tmodelo = new DefaultTableModel();
         tmodelo.setColumnIdentifiers(Titulos);
         
         for(Modelo.Paciente p:pacientes){
            registro[0]=p.getIdentificacion();
            registro[1]=p.getNombres();
            registro[2]=p.getApellidos();
            registro[3]=p.getFechaNacimiento();
            registro[4]=p.getGenero();
            tmodelo.addRow(registro);
         }
         consultarPacienteVista.tbl_datos.setModel(tmodelo);
    }
    
}
