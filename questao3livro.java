/**
inicio
    variáveis
    real c, f
    
    escreva("Insira a temperatura em Celsius:")
    leia(s_c)
    
    c := converte_para_real(s_c)
    f := (c * 1.8) + 32
    
    escreva("Temperatura em Celsius: ", c, "°C")
    escreva("Temperatura em Fahrenheit: ", f, "°F")
    
fim

TESTE DE MESA
Entrada      	c      	f
0	            0	     32.00
25	           25	     77.00
**/
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
