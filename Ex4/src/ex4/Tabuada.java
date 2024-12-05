package ex4;

import javax.swing.JOptionPane;
public class Tabuada {

    public static void main(String[] args) {
        CalcularTab calcular = new CalcularTab();
        
        try{
            JOptionPane.showMessageDialog(null, 
                calcular.CalcTab(
                        Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "))
                ));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro - Conversão Imprópria!");
            System.out.println(e.getMessage());
        }
    }
    
}
