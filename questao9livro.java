/** 
inicio
    variáveis
    real hpessoa, spessoa, spredio, hpredio
    
    escreva("Insira a altura da pessoa em metros:")
    leia(s_hpessoa)
    
    escreva("Insira o tamanho da sombra em metros:")
    leia(s_spessoa)
    
    escreva("Insira o tamanho da sombra do predio em metros:")
    leia(s_spredio)
    
    tente
        hpessoa := converte_para_real(s_hpessoa)
        spessoa := converte_para_real(s_spessoa)
        spredio := converte_para_real(s_spredio)
        
        hpredio := (hpessoa * spredio) / spessoa
        
        escreva("A altura do predio é ", arredonda(hpredio, 2), " m.")
    capture (NumberFormatException e)
        escreva("Por favor, insira um valor numérico válido")
    fimtente
    
fim

Entrada	       hpessoa	     spessoa        spredio	        hpredio	         Saída
1.75	           1.75	      1.0	         2.0	           3.50	            A altura do prédio é 3.50 m.
1.60	           1.60	      0.8	          1.6            	3.20            	A altura do prédio é 3.20 m. 
**/

package questao9livro;
import javax.swing.JOptionPane;

public class Questao9livro {

   
    public static void main(String[] args) {
    
        double hpessoa, spessoa, spredio, hpredio;
        
        String s_hpessoa, s_spessoa, s_spredio, s_hpredio;
        
       try { s_hpessoa = JOptionPane.showInputDialog(null,"Insira a altura da pessoa em metros:");
        s_spessoa = JOptionPane.showInputDialog(null, "Insira o tamanho da sombra em metros:");
        s_spredio = JOptionPane.showInputDialog(null, "Insira o tamanho da sombra do predio em metros:");
        
        hpessoa = Double.parseDouble(s_hpessoa);
        spessoa = Double.parseDouble(s_spessoa);
        spredio = Double.parseDouble(s_spredio);
        
        hpredio = (hpessoa * spredio) / spessoa;
        
        JOptionPane.showMessageDialog(null, "A altura do predio é" + String.format("%.2f", hpredio) + " m.");
       }
       catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Por favor, insira um valor numerico valido");
           
       }
     
    }
    
}
