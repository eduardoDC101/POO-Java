package principal;

import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while(numero != 0){
            numeros.Somatoria(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }
        
        JOptionPane.showMessageDialog(null, numeros.mostrarSoma());
    }
    
}
