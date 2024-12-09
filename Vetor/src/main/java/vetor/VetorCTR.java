package vetor;

public class VetorCTR {
    VetorDAO vetorDAO = new VetorDAO();
    
    public String verificaPosicao(VetorDTO vetorDTO){
        return vetorDAO.verificaPosicao(vetorDTO);
    }
}
