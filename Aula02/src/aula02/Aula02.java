package aula02;

import javax.swing.JOptionPane;

public class Aula02 {

    public static void main(String[] args) {
      Registrar pessoa = new Registrar();
      
      JOptionPane.showMessageDialog(null, 
              pessoa.nome(JOptionPane.showInputDialog("Digite seu nome: ")) + "\n" + 
              pessoa.idade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")))
              + "\nNúmero de salários minimos: \n" + 
              pessoa.salario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: ")))
      ); 
    }
    
}