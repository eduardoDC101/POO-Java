package polimorfismo3;

public class JuridicoDAO extends ClienteDAO{
    public String mostrarDadosCli(JuridicoDTO juridicoDTO){
        return super.mostrarDadosCli(juridicoDTO) + 
                "\nCNPJ: " + juridicoDTO.getCnpj() + 
                "\nIE: " + juridicoDTO.getIe();
    }
    
}
