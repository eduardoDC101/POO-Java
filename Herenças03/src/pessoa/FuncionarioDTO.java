package pessoa;

public class FuncionarioDTO extends PessoaDTO{
    private String siap, funcao;

    public String getSiap() {
        return siap;
    }

    public void setSiap(String siap) {
        this.siap = siap;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
