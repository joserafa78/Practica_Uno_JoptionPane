
import javax.swing.JOptionPane;


public class Inicio {

    public static void main(String[] args) {
        //variables
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Entrada de datos
        
        cadena = JOptionPane.showInputDialog("Digite la Cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero Entero")) ;
        letra = JOptionPane.showInputDialog("Digite solo la letra: ").charAt(0);
         decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite el dicimal con el Signo Punto(.)")) ;
         
         
         JOptionPane.showMessageDialog(null, "Detalles:"+cadena+" "+entero+" "+letra+" "+decimal);
               
  
    }
    
}
