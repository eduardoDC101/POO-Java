package vetor2;

import javax.swing.JOptionPane;
public class Vetor2View {

    public static void main(String[] args) {
       Vetor2DTO vetor2DTO = new Vetor2DTO();
       Vetor2CTR vetor2CTR = new Vetor2CTR();
       int mat[][] = new int[4][4];
       
       for(int i = 0; i<4; i++){
           for(int j = 0; j<4; j++){
               mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + i + j+ ": "));
           }
       }
       
       vetor2DTO.setMatriz(mat);
       
       JOptionPane.showMessageDialog(null, vetor2CTR.mostrarMatriz(vetor2DTO));
    }
}
