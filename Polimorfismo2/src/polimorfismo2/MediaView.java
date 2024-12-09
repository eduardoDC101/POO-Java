package polimorfismo2;

import javax.swing.JOptionPane;
public class MediaView {

    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        
        try{
            mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite N1: ")));
            mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite N2: ")));
            mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite N3: ")));
            mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite N4: ")));
            
            mediaDTO.setOpc(
                Integer.parseInt(JOptionPane.showInputDialog(
                        "<Calcular Médias>\n\n"
                                + "1 - Calcular média de 2 notas"+
                                "\n2 - Calcular média de 3 notas" + 
                                "\n3 - Calcular média de 4 notas\n\n"
                ))
            );
            
            mediaCTR.calcularMedia(mediaDTO);
        
        
            JOptionPane.showMessageDialog(null, mediaCTR.imprimir());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "O valor deve ser Numérico!");
            
        }
        
        
        
        
    }
    
}
