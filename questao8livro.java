package questao8livro;

import javax.swing.JOptionPane;

public class Questao8livro {


    public static void main(String[] args) {
        
        double c5, c10, c25, c50, real1,calculo;
        
        String sc5, sc10, sc25, sc50, sreal1;
        
       sc5 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 5 centavos.");
       sc10 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 10 centavos.");
      sc25 =   JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 25 centavos.");
      sc50 =   JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 50 centavos.");
       sreal1 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 1 real.");
        
        c5 = Double.parseDouble(sc5);
        c10 = Double.parseDouble(sc10);
        c25 = Double.parseDouble(sc25);
        c50 = Double.parseDouble(sc50);
        real1 = Double.parseDouble(sreal1);
        

        calculo = (c5 * 0.5) + (c10 * 0.10) + (c25 * 0.25) + (c50 * 0.50) + (real1 * 1.0);
        
        JOptionPane.showMessageDialog(null, "Você tem "+ String.format("%.2f", calculo) + " R$ no cofre.");

    }
    
}
