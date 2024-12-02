package aula03;

import javax.swing.JOptionPane;
public class Aula03 {

    public static void main(String[] args) {
       double n1,n2;
       String sinal;
       
       Calculadora calculadora = new Calculadora();
       
       n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
       n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
       sinal = JOptionPane.showInputDialog("Digite a operação: ");
       
       JOptionPane.showMessageDialog(null, calculadora.Calcular(sinal, n1, n2));
    }
    
}
