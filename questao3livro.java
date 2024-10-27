
package questao3livro;

import javax.swing.JOptionPane;

public class Questao3livro {


    public static void main(String[] args) {
        
       double c,f;
       
       String s_c;
       
       s_c = JOptionPane.showInputDialog(null, "Insira a temperatura em celsius: ");
       
       c = Double.parseDouble(s_c);
       
       f = (c * 1.8) + 32;
       
       JOptionPane.showMessageDialog(null, "Temperatura em celsius: "+ c + "°C"+ "\nTemperatura após conversão para fahreiheit: " + f + "°F");
       

        
    }
    
}
