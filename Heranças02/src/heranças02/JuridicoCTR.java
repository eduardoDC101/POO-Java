package heranças02;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostraDadosJudi(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosJudi(juridicoDTO);
    }
}
