/**
inicio
    variáveis
    real hnormal, hextra, salariob, salarioL, desconto
    
    escreva("Insira o total de horas normais trabalhadas:")
    leia(s_hnormal)
    
    escreva("Insira o total de horas extras trabalhadas:")
    leia(s_hextra)
    
    hnormal := converte_para_real(s_hnormal)
    hextra := converte_para_real(s_hextra)
    
    salariob := (hnormal * 10) + (hextra * 15)
    desconto := salariob * 0.1
    salarioL := salariob - desconto
    
    escreva("Salário bruto: ", salariob, "R$")
    escreva("Salário líquido: ", salarioL, "R$")
    
fim
TESTE DE MESA
Entrada	                   hnormal	           hextra	        salariob	desconto	salarioL
160 horas normais	         160	             10	            1750.00	       175.00	1575.00
180 horas normais	         180	             20	            1950.00	       195.00	1755.00

**/
package questao4livro;

import javax.swing.JOptionPane;

public class Questao4livro {


    public static void main(String[] args) {
        
        double hnormal, hextra, salariob, salarioL,desconto;
        
        String s_hnormal, s_hextra;
        
        s_hnormal = JOptionPane.showInputDialog(null, "Insira o total de horas normais trabalhadas: ");
        s_hextra= JOptionPane.showInputDialog(null, "Insira o total de horas extras trabalhadas: ");
       
        hnormal = Double.parseDouble(s_hnormal);
        hextra = Double.parseDouble(s_hextra);
        
        
        salariob = (hnormal * 10) + (hextra * 15);
        desconto = salariob  * 0.1;
        salarioL = salariob - desconto;
        
        JOptionPane.showMessageDialog(null, "Salario bruto: "+ salariob+ "R$" + "\nSalario liquido: "+ salarioL + "R$" );
        
    
    }
    
}
