package heranças;

public class MotoCTR{
    MotoDAO motoDAO = new MotoDAO();
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return motoDAO.imprimirDadosMoto(motoDTO);
    }
}
