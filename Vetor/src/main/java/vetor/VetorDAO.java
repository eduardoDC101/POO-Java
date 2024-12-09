package vetor;

public class VetorDAO {
    private String resposta="";
    
    public String verificaPosicao(VetorDTO vetorDTO){
        int n[] = vetorDTO.getN();
        
        for(int cont = 0; cont<n.length; cont++){
            if(cont % 2 == 0){
                this.resposta += n[cont] + "\n";
            }
        }
        return this.resposta;
    }
}
