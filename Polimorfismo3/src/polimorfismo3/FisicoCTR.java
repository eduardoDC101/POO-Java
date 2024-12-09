package polimorfismo3;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostrarDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosCli(fisicoDTO);
    }
}
