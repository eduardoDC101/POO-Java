package interface01;

public class MotoristaDAO {
    private String mensagem;
    
    public String calcular(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.mensagem = "Pode ter CNH!";
        }
        else{
            this.mensagem = "Não pode ter CNH!";
        }
        return this.mensagem;
    }
}
