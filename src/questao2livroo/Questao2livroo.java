
/**
    inicio
    variáveis
    real sanduiches, queijo, presunto, hamburguer
    
    escreva("Insira a quantidade de sanduíches:")
    leia(s_sanduiches)
    
    queijo := 0.100
    presunto := 0.050
    hamburguer := 0.100
    
    se (sanduiches > 1) entao
        queijo := 0.100 * sanduiches
        presunto := 0.050 * sanduiches
        hamburguer := 0.100 * sanduiches
    fimse
    
    escreva("Quantidade de ingredientes:")
    escreva("Queijo: ", queijo, "KG")
    escreva("Presunto: ", presunto, "KG")
    escreva("Hambúrguer: ", hamburguer, "KG")
    
fim
TESTE DE MESA
sanduíches /       queijo	       /         presunto             /	            hambúrguer
5             0.100 * 5 = 0.5 KG        0.50 * 5 = 0.25KG                0.100 * 5 = 0.5 KG 
   
1                0.100                      0.050                          0.100






**/
package questao2livroo;

import javax.swing.JOptionPane;

public class Questao2livroo {


    public static void main(String[] args) {
   
    double sanduiches,queijo,hamburguer,presunto;
    
    String s_sanduiches;
    
    s_sanduiches = JOptionPane.showInputDialog(null, "Insira a quantidade de sanduiches:");
    
    sanduiches = Double.parseDouble(s_sanduiches);
    
    queijo = 0.100;
    presunto = 0.050;
    hamburguer = 0.100;
    
    if (sanduiches > 1) {
        queijo = 0.100 * sanduiches;
        presunto = 0.050 * sanduiches;
        hamburguer = 0.100 * sanduiches;
       
    }
    else {
       queijo = 0.100;
       presunto = 0.050;
       hamburguer = 0.100;
    }
        
        JOptionPane.showMessageDialog(null, "Quantidade de ingredientes" + "\nQueijo:"+ queijo + "KG" + "\nPresunto"+ presunto + "KG" + "\nHamburguer:" + hamburguer + "KG");
        
     
    }
