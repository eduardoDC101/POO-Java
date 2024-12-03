package aula05;

public class Senha {
    private String senha, dados;
    
    public int Confirmacao(String senha){
        this.senha = senha;
        if (!(this.senha.equals("101LolabrA@"))){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public String Perfil(){
        this.dados = "Nome: Eduardo Dourado\nIdade: 19\nData de Criação: 27/10/2024\nSenha: 101LolabrA@";
        return this.dados;
    } 
}
