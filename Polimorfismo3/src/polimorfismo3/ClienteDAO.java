package polimorfismo3;

public class ClienteDAO {
    public String mostrarDadosCli(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome() + 
                "\nNúmero: " + clienteDTO.getNumero() +
                "\nEstado: " + clienteDTO.getEstado() +
                "\nCidade: " + clienteDTO.getCidade() + 
                "\nEndereço: " + clienteDTO.getEndereco();
    }  
}
