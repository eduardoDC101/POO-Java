package pessoa;

public class FuncionarioDAO extends PessoaDAO{
    private String retornoAposen; 
    
    
    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        
        return mostrarDadosPessoa(funcionarioDTO) +
                "\nSiap: " + funcionarioDTO.getSiap() + 
                "\nFunção: " + funcionarioDTO.getFuncao() + 
                "\n" + aposentadoriaFuncionario(funcionarioDTO);
    }
    
    private String aposentadoriaFuncionario(FuncionarioDTO funcionarioDTO){
        if(funcionarioDTO.getIdade() < 60 ){
            int faltaAposent = 60 - funcionarioDTO.getIdade();
            this.retornoAposen = "Faltam " + faltaAposent + " anos para você se aposentar";
            return this.retornoAposen;
        }
        else{
            this.retornoAposen = "Você já pode se aposentar";
            return this.retornoAposen;
        }
    }
}
