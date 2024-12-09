package heranças02;

public class FisicoDAO extends ClienteDAO{
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return mostraDadosCli(fisicoDTO) + 
                "\nCPF: " + fisicoDTO.getCpf() + 
                "\nRG: " + fisicoDTO.getRg();
    }
}
