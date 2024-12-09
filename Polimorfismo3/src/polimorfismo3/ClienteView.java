package polimorfismo3;

import javax.swing.JOptionPane;
public class ClienteView {
    public static void main(String[] args) {
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Digite seu nome fisico: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número fisico: ")));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Digite seu estado fisico: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Digite seu endereço fisico: "));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Digite sua cidade fisica: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Digite seu RG fisico: "));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Digite CPF nome fisico: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosCli(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Digite seu nome juridico: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número juridico: ")));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Digite seu estado juridico: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Digite seu endereço juridico: "));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Digite sua cidade juridico: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Digite seu IE juridico: "));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Digite CNPJ nome juridico: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosCli(juridicoDTO));
    }
    
}
