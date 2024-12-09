package heranças;

import javax.swing.JOptionPane;
public class VeiculoView {

    public static void main(String[] args) {
       CarroDTO carroDTO = new CarroDTO();
       CarroCTR carroCTR = new CarroCTR();
       
       carroDTO.setCor(JOptionPane.showInputDialog("Digite a cor do Carro: "));
       carroDTO.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro: "));
       carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia do Carro: ")));
       carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas do Carro: ")));
       
       JOptionPane.showMessageDialog(null, carroCTR.imprimirDadosCarro(carroDTO));
       
       MotoDTO motoDTO = new MotoDTO();
       MotoCTR motoCTR = new MotoCTR();
    
       motoDTO.setCor(JOptionPane.showInputDialog("Digite a cor da Moto: "));
       motoDTO.setPlaca(JOptionPane.showInputDialog("Digite a placa da Moto: "));
       motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Digite as cilindradas da Moto: ")));
       motoDTO.setTipo_motor(JOptionPane.showInputDialog("Digite o tipo de motor da Moto: ")); 
       
       JOptionPane.showMessageDialog(null, motoCTR.imprimirDadosMoto(motoDTO));
    }
    
}
