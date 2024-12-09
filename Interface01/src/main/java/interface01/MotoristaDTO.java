package interface01;

public class MotoristaDTO implements IMotoristaDTO{
    private int idade;

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
