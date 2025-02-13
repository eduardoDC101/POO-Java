package ex3;

public class IdadeDAO {
    
    public String testeIdade(IdadeDTO idadeDTO){
        if(idadeDTO.getIdade() >=18){
            return "Pode tirar Carteira de Motorista";
        }else{
            return "Não pode tirar Carteira de Motorista";
        }
    }
}
