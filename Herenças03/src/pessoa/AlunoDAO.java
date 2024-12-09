package pessoa;

public class AlunoDAO extends PessoaDAO{
    public String mostrarDadosAluno(AlunoDTO alunoDTO){
        return mostrarDadosPessoa(alunoDTO) + 
                "\nCurso: " + alunoDTO.getCurso() + 
                "\nProntuário: " + alunoDTO.getProntuario();
        
    }
}
