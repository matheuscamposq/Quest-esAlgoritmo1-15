
package questao2livroo;

import javax.swing.JOptionPane;

public class Questao2livroo {


    public static void main(String[] args) {
   
    double sanduiches,queijo,hamburguer,presunto;
    
    String s_sanduiches;
    
    s_sanduiches = JOptionPane.showInputDialog(null, "Insira a quantidade de sanduiches:");
    
    sanduiches = Double.parseDouble(s_sanduiches);
    
    queijo = 0.050;
    presunto = 0.050;
    hamburguer = 0.100;
    
    if (sanduiches > 1) {
        queijo = 0.050 * sanduiches;
        presunto = 0.050 * sanduiches;
        hamburguer = 0.050 * sanduiches;
       
    }
    else {
       queijo = 0.050;
       presunto = 0.050;
       hamburguer = 0.050;
    }
        
        JOptionPane.showMessageDialog(null, "Quantidade de ingredientes" + "\nQueijo:"+ queijo + "KG" + "\nPresunto"+ presunto + "KG" + "\nHamburguer:" + hamburguer + "KG");
        
     
    }