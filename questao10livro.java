/**
inicio
    variáveis
    real litros, agua, suco
    
    escreva("Insira a quantidade de refresco desejada (em litros):")
    leia(litros)
    
    agua := litros * (8.0 / 10.0)
    suco := litros * (2.0 / 10.0)
    
    escreva("Para fazer ", litros, " litros de refresco você vai precisar de:")
    escreva(agua, " litros de água.")
    escreva(suco, " litros de suco de maracujá.")
    
fim
Entrada	litros	água	suco	Saída
10	10	8.0	2.0	Para fazer 10 litros de refresco você vai precisar de: 8.0 litros de água, 2.0 litros de suco de maracujá.
* 
**/

package questao10livro;

import javax.swing.JOptionPane;

public class Questao10livro {


    public static void main(String[] args) {
        
        double qrefresco, suco, agua;
        
        String s_qrefresco;
        
        s_qrefresco = JOptionPane.showInputDialog(null, "Insira a quantidade de refresco que deseja produzir: ");
        
        qrefresco = Double.parseDouble(s_qrefresco);
        
        suco = qrefresco * 0.2;
        agua = qrefresco * 0.8;
        
        if (suco>0 && agua>0){
            JOptionPane.showMessageDialog(null, "Serão necessarios "+ suco + "L de suco" + " e "+ agua+"L de agua "+ " para produção do refresco." );
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Insira um valor numerico maior que 0!!!");
        }

    }
    
}
