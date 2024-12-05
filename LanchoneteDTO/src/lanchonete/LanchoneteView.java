package lanchonete;

import javax.swing.JOptionPane;
public class LanchoneteView {

    public static void main(String[] args) {
        LanchoneteDTO lanchoneteDTO = new LanchoneteDTO();
        LanchoneteCTR lanchoneteCTR = new LanchoneteCTR();
        
        try{
            do{
                lanchoneteDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(lanchoneteCTR.mostrarMenu())));
            
                lanchoneteCTR.receberCodigo(lanchoneteDTO);
            }while( lanchoneteDTO.getCodigo() != 0);
        
            JOptionPane.showMessageDialog(null, lanchoneteCTR.retornarConta(lanchoneteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro - Não digitou um número!");
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
}
