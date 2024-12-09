package heranças02;

public class JuridicoDAO extends ClienteDAO {
    public String mostraDadosJudi(JuridicoDTO juridicoDTO){
        return mostraDadosCli(juridicoDTO) + 
                "\nCNPJ: " + juridicoDTO.getCnpj() + 
                "\nIE: " + juridicoDTO.getIe();
    }
}
