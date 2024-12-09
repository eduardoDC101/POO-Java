package polimorfismo3;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostrarDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosCli(juridicoDTO);
    }
}
