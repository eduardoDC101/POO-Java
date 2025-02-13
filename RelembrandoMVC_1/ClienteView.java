package ex1;
import javax.swing.JOptionPane;

public class ClienteView {

    public static void main(String[] args) {
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome:"));
            clienteDTO.setRg(JOptionPane.showInputDialog("Digite o RG:"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o nome:")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Sistema" + e.getMessage());
        }
    }
}
