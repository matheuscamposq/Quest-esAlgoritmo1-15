/**
inicio
    variáveis
    inteiro frangos
    real custo
    
    escreva("Insira a quantidade de frangos contidos na granja:")
    leia(s_frangos)
    
    frangos := converte_para_inteiro(s_frangos)
    custo := frangos * 11
    
    escreva("O valor total gasto com os frangos é: ", arredonda(custo, 2), "R$")
    
fim

TESTE

Entrada	frangos	custo
100	     100	    1100.00 R$
200	     200	  2200.00 R$
**/
package questao5livro;

import javax.swing.JOptionPane;

public class Questao5livro {

   
    public static void main(String[] args) {
        int frangos;
        double custo;
        
        String s_frangos;
        
        s_frangos = JOptionPane.showInputDialog(null, "Insira a quantidade de frangos contidos na granja: ");
        
        frangos = Integer.parseInt(s_frangos);
        
        custo = frangos * 11;
        
        JOptionPane.showMessageDialog(null, "O valor total gasto com os frangos é: "+ String.format("%.2f", custo));
  
    }
    
}
