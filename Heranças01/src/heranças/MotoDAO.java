package heranças;
public class MotoDAO extends VeiculoDAO{
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return imprimirDadosVeiculo(motoDTO) + 
                "\nA cilindrada é: " + motoDTO.getCilindrada() + 
                "\nO tipo do motor é: " + motoDTO.getTipo_motor();
    }
}
