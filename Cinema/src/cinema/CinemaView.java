package cinema;

import javax.swing.JOptionPane;
public class CinemaView {

    public static void main(String[] args) {
        CinemaDTO cinemaDTO = new CinemaDTO();
        CinemaCTR cinemaCTR = new CinemaCTR();
        
        do{
            
            cinemaDTO.setOpcao(Integer.parseInt(JOptionPane.showInputDialog(cinemaCTR.Menu())));
            if (cinemaDTO.getOpcao() == 1 || cinemaDTO.getOpcao() ==2){
                cinemaCTR.comprarIngresso(cinemaDTO);
            }
            if (cinemaDTO.getOpcao() == 3){
                JOptionPane.showMessageDialog(null, cinemaCTR.mostrarCarrinho(cinemaDTO));
            }
            
        }while(cinemaDTO.getOpcao() != 4);
        
        JOptionPane.showMessageDialog(null, "\nFim do Programa\n");
    }
    
}
