package aula04;

import javax.swing.JOptionPane;
public class Aula04 {

    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        
        JOptionPane.showMessageDialog(null, 
                tabuada.CalcTabuada(
                        Integer.parseInt(
                                JOptionPane.showInputDialog("Digite um número: ")
                        )));
    }
    
}
