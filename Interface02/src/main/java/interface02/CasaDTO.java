package interface02;

public class CasaDTO extends ImovelDTO implements ICasaDTO{
    private int banheiro,quartos;

    @Override
    public int getBanheiros() {
        return banheiro;
    }

    @Override
    public void setBanheiros(int banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public int getQuartos() {
        return quartos;
    }

    @Override
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
}
