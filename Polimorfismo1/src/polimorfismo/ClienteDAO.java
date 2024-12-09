package polimorfismo;

public class ClienteDAO {
    public String mostrarDados(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome() + 
                "\nRG: " + clienteDTO.getRg() +
                calcular(clienteDTO.getIdade())+ 
                calcular(clienteDTO.getAltura()); 
    }
    
    private String calcular(int idade){
        if(idade >= 18){
            return "\nMaior de idade";
        }
        else{
            return "\nMenor de idade";
        }
    }
    
    private String calcular(double altura){
        if(altura >= 1.50){
            return "\nAltura permitida";
        }
        else{
            return "\nSem altura necessária";
        }
    }
}
