package lanchonete;

public class LanchoneteDAO {
    private String menu, resultado="";
    private double soma;
    
    public String mostrarMenu(){
        this.menu = "Código     Produto         Preço(R$)\n"
                +   "1          Hamburger       1.50\n" +
                    "2          Cheeseburger    1.80\n" + 
                    "3          Misto Quente    1.20\n" + 
                    "4          Americano       2.00\n" + 
                    "5          Queijo Prato    1.00\n";
        return this.menu;
    }
    
    public void receberCodigo(LanchoneteDTO lanchoneteDTO){
       if (lanchoneteDTO.getCodigo() == 1){
           lanchoneteDTO.setNumero_h(lanchoneteDTO.getNumero_h()+1);
       }
       if(lanchoneteDTO.getCodigo() == 2){
           lanchoneteDTO.setNumero_c(lanchoneteDTO.getNumero_c()+1);
       }
       if(lanchoneteDTO.getCodigo() == 3){
           lanchoneteDTO.setNumero_m(lanchoneteDTO.getNumero_m()+1);
       }
       if(lanchoneteDTO.getCodigo() == 4){
           lanchoneteDTO.setNumero_a(lanchoneteDTO.getNumero_a()+1);
       }
       if(lanchoneteDTO.getCodigo() == 5){
           lanchoneteDTO.setNumero_q(lanchoneteDTO.getNumero_q()+1);
       }
    }
    
    public String retornarConta(LanchoneteDTO lanchoneteDTO){
        if (lanchoneteDTO.getNumero_h() != 0){
            resultado += "Produto: Hamburger   Quantidade:"+ lanchoneteDTO.getNumero_h() + "   Valor:"+ 1.5*lanchoneteDTO.getNumero_h()+"\n";
        }
        if (lanchoneteDTO.getNumero_c() != 0){
            resultado += "Produto: Cheeseburger   Quantidade:"+ lanchoneteDTO.getNumero_c() + "   Valor:"+ 1.8*lanchoneteDTO.getNumero_c()+"\n";
        }
        if (lanchoneteDTO.getNumero_m() != 0){
            resultado += "Produto: Misto Quente   Quantidade:"+ lanchoneteDTO.getNumero_m() + "   Valor:"+ 1.2*lanchoneteDTO.getNumero_m()+"\n";
        }
        if (lanchoneteDTO.getNumero_a() != 0){
            resultado += "Produto: Americano   Quantidade:"+ lanchoneteDTO.getNumero_a() + "   Valor:"+ 2*lanchoneteDTO.getNumero_a()+"\n";
        }
        if (lanchoneteDTO.getNumero_q() != 0){
            resultado += "Produto: Queijo Prato   Quantidade:"+ lanchoneteDTO.getNumero_q() + "   Valor:"+ 1*lanchoneteDTO.getNumero_q()+"\n";
        }
        soma = 1.5*lanchoneteDTO.getNumero_h()+1.8*lanchoneteDTO.getNumero_c()+1.2*lanchoneteDTO.getNumero_m()+2*lanchoneteDTO.getNumero_a()+1*lanchoneteDTO.getNumero_q();
        resultado += "\nTotal a Pagar: " + soma;
        return resultado;
        
    }
}
