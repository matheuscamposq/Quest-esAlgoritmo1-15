
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
