package ex5;

import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
       Letras letras = new Letras();
       String letra;
       
       try{
            do{
                letra = JOptionPane.showInputDialog("Digite uma letra: ");
                letras.recebeLetras(letra);
            }while(!letra.equalsIgnoreCase("x"));

            JOptionPane.showMessageDialog(null, letras.Resultado());
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "ERRO de conversão!");
       }
    }
    
}
