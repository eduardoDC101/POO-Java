package interface02;

public class CasaDAO implements ICasaDAO{
    private String mensagem="";
    
    @Override
    public String publicarDados(CasaDTO casaDTO){
        this.mensagem = "<Dados Imóvel>\n\nEndereço: " + casaDTO.getEndereco() + 
                "\nNúmero: " + casaDTO.getNumero() + 
                "\nBairro: " + casaDTO.getBairro()+ 
                "\nCidade: " + casaDTO.getCidade() + 
                "\nQuantidade de quartos: " + casaDTO.getQuartos() + 
                "\nQuantidade de banheiros: " + casaDTO.getBanheiros() + 
                "\nProprietário: " + casaDTO.getProprietario();
        
        return this.mensagem;
    }
}
