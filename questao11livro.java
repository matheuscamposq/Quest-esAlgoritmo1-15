/**
inicio
    variáveis
    real volume, raio, altura, calculo
    
    escreva("Insira o raio da caixa d'água em centímetros: ")
    leia(raio)
    
    escreva("Insira a altura da caixa d'água em centímetros: ")
    leia(altura)
    
    calculo := 3.14 * (raio * raio) * altura  // Cálculo do volume em cm³
    volume := calculo / 1000                   // Conversão de cm³ para litros
    
    escreva("O volume da caixa d'água é de aproximadamente ", volume, " L")
    
fim
 
 Entrada                       	raio	                     altura	                         cálculo (cm³)	               volume (L)	                 
insira o raio                    50                                                      3.14*2500*200/1000                  314L

insira a altura                                              200                                 

**/

package questao11livro;

import javax.swing.JOptionPane;

public class Questao11livro {

   
    public static void main(String[] args) {

        double volume, raio, altura, calculo;
        
        String s_raio, s_altura;
        
        s_raio = JOptionPane.showInputDialog(null,"insira o raio da caixa d'agua: ");
        s_altura = JOptionPane.showInputDialog(null, "Insira a altura da caixa d'agua em centimetros:");
        
        raio = Double.parseDouble(s_raio);
        altura = Double.parseDouble(s_altura);
        
         calculo = 3.13 * (raio * raio) *altura;
         
         volume = calculo / 1000;
         
         JOptionPane.showMessageDialog(null, "O volume da caixa d'agua é de aproximadamente " + volume+ "L");
        

        
    }
    
}
