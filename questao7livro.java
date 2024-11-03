/** 
inicio
    variáveis
    inteiro lata, garrafa1, garrafa2
    real calculo

    escreva("Insira a quantidade de latas compradas:")
    leia(s_lata)
    
    escreva("Insira a quantidade de garrafas de 600ml compradas:")
    leia(s_garrafa1)
    
    escreva("Insira a quantidade de garrafas de 2L compradas:")
    leia(s_garrafa2)
    
    lata := converte_para_inteiro(s_lata)
    garrafa1 := converte_para_inteiro(s_garrafa1)
    garrafa2 := converte_para_inteiro(s_garrafa2)
    
    se (lata < 0 ou garrafa1 < 0 ou garrafa2 < 0) entao
        escreva("Por favor, insira um valor numérico positivo.")
    senao
        calculo := (lata * 0.300) + (garrafa1 * 0.600) + (garrafa2 * 2.000)
        escreva("Foram adquiridos ", arredonda(calculo, 2), " litros de refrigerante.")
    fimse
    
fim
Entrada	    lata	garrafa1	garrafa2	calculo	        Saída
10	          5	      3          	9	      23.30	        Foram adquiridos 23.30 litros de refrigerante.
0	          2	      0	            1	      2.20	        Foram adquiridos 2.20 litros de refrigerante.
-1	          5	      2	            3	      ---           Por favor, insira um valor numérico positivo.
**/

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
