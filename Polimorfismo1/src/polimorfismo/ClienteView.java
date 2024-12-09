package polimorfismo;

import javax.swing.JOptionPane;
public class ClienteView {

    public static void main(String[] args) {
       ClienteDTO clienteDTO = new ClienteDTO();
       ClienteCTR clienteCTR = new ClienteCTR();
       
       clienteDTO.setNome(
               JOptionPane.showInputDialog("Digite seu nome: ")
       );
       clienteDTO.setRg(
               JOptionPane.showInputDialog("Digite seu RG: ")
       );
       clienteDTO.setIdade(
               Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "))
       );
       clienteDTO.setAltura(
               Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "))
               
       );
       
       JOptionPane.showMessageDialog(null, 
               clienteCTR.mostrarDados(clienteDTO)
       );

    }
    
}
