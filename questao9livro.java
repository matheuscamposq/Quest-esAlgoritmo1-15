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
