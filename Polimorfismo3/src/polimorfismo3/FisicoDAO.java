package polimorfismo3;

public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosCli(FisicoDTO fisicoDTO){
        return super.mostrarDadosCli(fisicoDTO) + 
                "\nCPF: " + fisicoDTO.getCpf() + 
                "\nRG: " + fisicoDTO.getRg();
    }
}
