package heranças;

public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();
    
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return carroDAO.imprimirDadosCarro(carroDTO);
    }
}
