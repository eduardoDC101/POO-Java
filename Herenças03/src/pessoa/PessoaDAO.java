package pessoa;

public class PessoaDAO {
    public String mostrarDadosPessoa(PessoaDTO pessoaDTO){
        return "Nome: " + pessoaDTO.getNome() + 
                "\nIdade: " + pessoaDTO.getIdade() + 
                "\nEndereço: " + pessoaDTO.getEndereco() + 
                "\nTelefone: " + pessoaDTO.getTelefone();
    }
}
