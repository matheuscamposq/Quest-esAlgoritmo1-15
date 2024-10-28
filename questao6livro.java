
package questao6livro;

import javax.swing.JOptionPane;

public class Questao6livro {


    public static void main(String[] args) {
   
       int novelos,blusas;
       double calculo;
        
        String s_novelos, s_blusas;
        
        s_blusas = JOptionPane.showInputDialog(null, "informe a quantidade de blusas para a confeção: ");
        s_novelos = JOptionPane.showInputDialog(null, "informe a quantidade total de novelos: ");
        
        novelos = Integer.parseInt(s_novelos);
        blusas = Integer.parseInt(s_blusas);
        


if(blusas > 0) {
    calculo = (double) novelos / blusas;
    
     JOptionPane.showMessageDialog(null, "Serão usados "+ calculo + " novelos por blusa.");
}        
else {
    JOptionPane.showMessageDialog(null, "ATENÇÃO!!!" +  "\nO número de blusas deve ser maior que 0.");
}
        
    }
    
}
