package interface02;

import javax.swing.JOptionPane;
public class ImovelView {

    public static void main(String[] args) {
        CasaDTO casaDTO = new CasaDTO();
        CasaCTR casaCTR = new CasaCTR();
        
        casaDTO.setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
        casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
        casaDTO.setBairro(JOptionPane.showInputDialog("Digite o bairro: "));
        casaDTO.setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
        casaDTO.setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário: "));
        casaDTO.setBanheiros(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de banheiros: ")));
        casaDTO.setQuartos(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quartos: ")));
        
        JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
    }
}
