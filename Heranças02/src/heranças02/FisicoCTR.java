package heranças02;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosFisi(fisicoDTO);
    }
}
