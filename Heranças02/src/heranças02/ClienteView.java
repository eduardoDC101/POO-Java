package heranças02;

import javax.swing.JOptionPane;
public class ClienteView {

    public static void main(String[] args) {
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Digite seu nome Juridico: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Digite seu endereço Juridico: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número Juridico: ")));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Digite sua cidade Juridica: "));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Digite seu estado Juridico: "));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Digite seu CNPJ Juridico: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Digite seu IE Juridico: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostraDadosJudi(juridicoDTO));
        
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Digite seu nome Fisico: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Digite seu endereço Fisico: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número Fisico: ")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Digite sua cidade Fisica: "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Digite seu estado Fisico: "));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Digite seu CPF Fisico: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Digite seu RG Fisico: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosFisi(fisicoDTO));
    }
    
}
