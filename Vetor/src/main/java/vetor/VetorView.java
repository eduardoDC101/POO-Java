package vetor;

import javax.swing.JOptionPane;
public class VetorView {

    public static void main(String[] args) {
        VetorDTO vetorDTO = new VetorDTO();
        VetorCTR vetorCTR = new VetorCTR();
        int num[] = new int[5];
        
        for(int cont=0; cont<5; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe um número para a posição " + cont));      
        }
        vetorDTO.setN(num);
        JOptionPane.showMessageDialog(null, vetorCTR.verificaPosicao(vetorDTO));
    }
}
