package testevogal;

import javax.swing.JOptionPane;
public class TesteVogal {

    public static void main(String[] args) {
        Verificar verificar = new Verificar();
        JOptionPane.showMessageDialog(null,
                verificar.MostrarVogais(JOptionPane.showInputDialog("Digite uma Frase: "))
                );
    }
    
}
