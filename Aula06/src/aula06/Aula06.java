package aula06;

import javax.swing.JOptionPane;
public class Aula06 {

    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        
        try{
            JOptionPane.showMessageDialog(null, 
                    tabuada.FazerTabuada(Double.parseDouble(
                    JOptionPane.showInputDialog("Digite um número: ")))
            );
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro 001 - Não digitou um número!\n" + 
                    "Naveg. Error: " + e.getMessage());
        }
        finally{
            System.out.println("--- Fim do Sistema ---");
        }
    }
}
