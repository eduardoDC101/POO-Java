package aula05;

import javax.swing.JOptionPane;
public class Aula05 {

    public static void main(String[] args) {
        Senha senha = new Senha();
        String tentativa;
        int retorno;
        
        do{
            tentativa = JOptionPane.showInputDialog("Digite a senha: ");
            retorno = senha.Confirmacao(tentativa);
        }while(retorno == 0);
        JOptionPane.showMessageDialog(null,senha.Perfil());
    }
    
}
