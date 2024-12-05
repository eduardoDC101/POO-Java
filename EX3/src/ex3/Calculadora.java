package ex3;

import javax.swing.JOptionPane;
public class Calculadora {

    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        
        try{
            JOptionPane.showMessageDialog(null, 
                calcular.calcResultado(
                        JOptionPane.showInputDialog("Digite a operação: "),
                        Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")),
                        Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "))
                ));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro - Não digitou os valores necessários!");
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
