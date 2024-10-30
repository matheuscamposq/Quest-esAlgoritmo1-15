package questao7livro;

import javax.swing.JOptionPane;

public class Questao7livro {


    public static void main(String[] args) {
 
        int lata, garrafa1, garrafa2;
        double calculo;
        
        String s_lata,s_garrafa1, s_garrafa2;
        
        
      try {  s_lata = JOptionPane.showInputDialog(null, "Insira a quantidade de latas compradas:");
        s_garrafa1 = JOptionPane.showInputDialog(null, "Insira a quantidade de garrafas de 600ml compradas:");
        s_garrafa2 = JOptionPane.showInputDialog(null, "Insira a quantidade de garrafas de 2L compradas:");
        
        lata = Integer.parseInt(s_lata);
        garrafa1 = Integer.parseInt(s_garrafa1);
        garrafa2 = Integer.parseInt(s_garrafa2);
        
        calculo = (lata * 0.300) + (garrafa1 * 0.600) + (garrafa2 * 2.000);
        
        if (lata < 0 || garrafa1 < 0 || garrafa2 < 0 ) {
            
            JOptionPane.showMessageDialog(null, "Por favor, Insira um valor numerico positivo."); 
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Foram adquiridos "+ calculo + " litros de refrigerante.");
        }
    
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Por favor, Insira valores numericos validos.");
      }

    }
    
}
