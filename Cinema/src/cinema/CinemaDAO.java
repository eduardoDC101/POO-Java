package cinema;

public class CinemaDAO {
    private String menu, carrinhodao="";
    private double total = 0;
    
    public String Menu(){
        this.menu = "[Selecione uma Opção]\n\nSelecione [1] para COMPRAR 01                               MEIA ENTRADA (+R$ 10,50)"
                + "\nSelecione [2] para COMPRAR 01                          ENTRADA INTEIRA (+R$ 21,00)"
                + "\nSelecione [3] para MOSTRAR o carrinho"
                + "\nSelecione [4] para SAIR";
        return this.menu;
    }
    
    public void comprarIngresso(CinemaDTO cinemaDTO){
        if (cinemaDTO.getOpcao() == 1){
            cinemaDTO.setN_meia(cinemaDTO.getN_meia()+1);
        }
        if (cinemaDTO.getOpcao() == 2){
            cinemaDTO.setN_inteira(cinemaDTO.getN_inteira()+1);
        }
    }
    
    public String mostrarCarrinho(CinemaDTO cinemaDTO){
        this.total = 0;
        this.total = (cinemaDTO.getN_inteira()*21) + (cinemaDTO.getN_meia()*10.5);
        this.carrinhodao = "[Carrinho do Cinema]\n\nNumero de ENTRADAS INTEIRAS         " + cinemaDTO.getN_inteira() + 
                "\nNúmero de ENTRADAS MEIA                 " + cinemaDTO.getN_meia() + 
                "\n\nTotal a PAGAR:                                         " + "R$"+ this.total;
        return this.carrinhodao;
    }
    
    
}
