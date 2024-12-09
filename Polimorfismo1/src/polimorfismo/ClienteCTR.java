package polimorfismo;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostrarDados(ClienteDTO clienteDTO){
        return clienteDAO.mostrarDados(clienteDTO);
    }
    
}
