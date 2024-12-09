package interface01;

import javax.swing.JOptionPane;
public class MotoristaView {

    public static void main(String[] args) {
       MotoristaDTO motoristaDTO = new MotoristaDTO();
       MotoristaCTR motoristaCTR = new MotoristaCTR();
        
       
       motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
       JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
    }
}
