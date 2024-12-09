package pessoa;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarDadosFuncionario(funcionarioDTO);
    }
}
