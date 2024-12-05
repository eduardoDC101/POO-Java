package ex2;

import javax.swing.JOptionPane;
public class Medias {

    public static void main(String[] args) {
      Calcular calcular = new Calcular();
      
      try{
           JOptionPane.showMessageDialog(null, 
              calcular.calcMedia(
                      Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: ")),
                      Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "))
              ));
      }
      catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Erro - Não digitou um número!");
          System.out.println("Erro: " + e.getMessage());
          
      }
      finally{
          System.out.println("--- Fim da execussão ---");
      }
      
    }
    
}
