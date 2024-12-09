package vetor2;

public class Vetor2CTR {
    Vetor2DAO vetor2DAO = new Vetor2DAO();
    
    public String mostrarMatriz(Vetor2DTO vetor2DTO){
        return vetor2DAO.mostrarMatriz(vetor2DTO);
    }
}
