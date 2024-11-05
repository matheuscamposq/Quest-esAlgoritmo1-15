/**
inicio
    variáveis
    real g, m, p, ano, calculo
    cadeia s_g, s_m, s_p, s_ano
    
    escreva("Insira o total de projetos de grande porte feitos: ")
    leia(s_g)
    
    escreva("Insira o total de projetos de médio porte feitos: ")
    leia(s_m)
    
    escreva("Insira o total de projetos de pequeno porte feitos: ")
    leia(s_p)
    
    escreva("Insira o total de anos trabalhados na empresa: ")
    leia(s_ano)
    
    calculo := (g * 10) + (m * 5) + (p * 2) + (ano * 2)
    
    se (ano > 0) entao
        escreva("O total de pontos acumulados é de: ", calculo)
    senao
        escreva("Você deve trabalhar na empresa para consultar esta informação.")
    fimse
fim
* 
* G          M           P            ANO                                       calculo                                                 escreva
* 3           2           1            5                   calculo = (3 * 10) + (2 * 5) + (1 * 2) + (5 * 2)                     "O total de pontos acumulados é de: 52"
* 2           1           3            0                                    ''                                               "Você deve trabalhar na empresa para consultar esta informação."
* 

**/

package questao16livro;
 
import javax.swing.JOptionPane;

public class Questao16livro {

 
    public static void main(String[] args) {
       
        double g, m, p, ano, calculo;
        
        String s_g, s_m, s_p, s_ano;
        
        s_g = JOptionPane.showInputDialog(null,"Insira o total de projetos de grande porte feitos:");
        s_m = JOptionPane.showInputDialog(null,"Insira o total de projetos de medio porte feitos:");
        s_p = JOptionPane.showInputDialog(null,"Insira o total de projetos de pequeno porte feitos:");
        s_ano = JOptionPane.showInputDialog(null,"Insira o total de anos trabalhados na empresa");
        
        g = Double.parseDouble(s_g);
        m = Double.parseDouble(s_m);
        p = Double.parseDouble(s_p);
        ano = Double.parseDouble(s_ano);
        
        calculo = (g*10) + (m*5)+(p*2)+(ano*2);
        
        
        if(ano>0){
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é de: "+ calculo);    
        }
        else{
            JOptionPane.showMessageDialog(null, "Você deve trabalhar na empresa para consultar esta informação.");
        }
     
    }
    
}
