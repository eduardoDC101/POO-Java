package heranças;

public class CarroDAO extends VeiculoDAO{
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return imprimirDadosVeiculo(carroDTO) + 
                "\nA potência é: "+ carroDTO.getPotencia() + 
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
