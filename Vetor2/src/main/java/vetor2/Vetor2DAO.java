package vetor2;

public class Vetor2DAO {
    private String exibirmatriz ="";
    
    public String mostrarMatriz(Vetor2DTO vetor2DTO){
        int matriz[][] = vetor2DTO.getMatriz();
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                this.exibirmatriz += matriz[i][j] + " ";
            }
            this.exibirmatriz += "\n";
        }
        return this.exibirmatriz;
    }
}
