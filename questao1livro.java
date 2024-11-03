/**
inicio
    variáveis
    real valorconta, valordividido, diferenca, felipe
    inteiro valorsemcentavos
    
    escreva("Insira o valor a ser pago:")
    leia(s_valorconta)
    
    valorconta := converte_para_real(s_valorconta)
    valordividido := valorconta / 3
    valorsemcentavos := parte_inteira(valordividido)
    diferenca := valorconta - (valorsemcentavos * 2 + valordividido)
    
    se (diferenca > 0) entao
        felipe := valordividido + diferenca
    senao
        felipe := valordividido
    fimse
    
    escreva("Carlos pagará: R$ ", valorsemcentavos)
    escreva("André pagará: R$ ", valorsemcentavos)
    escreva("Felipe pagará: R$ ", arredonda(felipe, 2))
    
fim
TESTE DE MESA

Entrada	valorconta	valordividido	valorsemcentavos	diferenca	Carlos	André	Felipe
100.00	100.00	33.33	33	0.01	33	33	33.34
150.00	150.00	50.00	50	0.00	50	50	50.00


**/

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
