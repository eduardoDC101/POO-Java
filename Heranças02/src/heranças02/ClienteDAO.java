package heranças02;

public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "\nNome: " + clienteDTO.getNome() + 
                "\nEndereço: " + clienteDTO.getEndereco() + 
                "\nNúmero: " + clienteDTO.getNumero() + 
                "\nCidade: " + clienteDTO.getCidade() + 
                "\nEstado: " + clienteDTO.getEstado();
    }
}
