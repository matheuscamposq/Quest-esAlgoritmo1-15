
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
