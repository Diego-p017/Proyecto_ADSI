
package Colecciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ciudades {

    ArrayList<String> ListaCuidades = new ArrayList<String>();
     
    public void recorre(){
    for(int i=0; i<=4; i++)
    {
        ListaCuidades.add(JOptionPane.showInputDialog("Ingrese el nombre de la cuidad:"+i));
    }
        System.out.println(ListaCuidades);
    }
    public static void main(String[] args) {
        Ciudades ciu = new Ciudades();
        ciu.recorre();
    }
    
}
