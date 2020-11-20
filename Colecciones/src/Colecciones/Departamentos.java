
package Colecciones;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Departamentos {

    private static Hashtable<String, String> ListaDep;
    
    public void iniciar(){
        Hashtable<String, String> ListaDep = new Hashtable<>();
        
        for(int i=0; i<5; i++){
        String ciudad = (JOptionPane.showInputDialog("Digite el nombre de la ciudad"));
        String departamento = JOptionPane.showInputDialog("Digite el bomnre de departemento");
        ListaDep.put(ciudad, departamento);
        }
        recorrertabla(ListaDep);
    }
    
    public void recorrertabla(Hashtable<String, String> tabla ){
        Enumeration<String> ciudad = tabla.elements();
        Enumeration<String> departamento = tabla.keys();
        
        while(ciudad.hasMoreElements()){
            System.out.println(ciudad.nextElement()+"-"+departamento.nextElement());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Departamentos dep = new Departamentos();
        dep.iniciar();
        dep.recorrertabla(ListaDep);
    }
    
}
