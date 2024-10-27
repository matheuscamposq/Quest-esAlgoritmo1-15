package questao1livro;

import javax.swing.JOptionPane;

public class Questao1livro {

    
    public static void main(String[] args) {
    
        double valorconta,valordividido,diferenca;
        
        String s_valorconta;
        
        s_valorconta = JOptionPane.showInputDialog(null, "Insira o valor a ser pago: ");
        
        valorconta = Double.parseDouble(s_valorconta);
        
        valordividido = valorconta / 3;
        
        int valorsemcentavos = (int) valordividido;
        
        diferenca = valorconta - (valorsemcentavos * 2 + valordividido);
        
        double carlos,andre,felipe;
        
        if (diferenca > 0) {
            felipe = valordividido + diferenca;
    
        }
        else {
            felipe = valordividido;
        }
     
        JOptionPane.showMessageDialog(null,
            "Carlos pagará: R$ " + valorsemcentavos +
            "\nAndré pagará: R$ " + valorsemcentavos +
            "\nFelipe pagará: R$ " + String.format("%.2f", felipe));
        
     
    }
    
}
