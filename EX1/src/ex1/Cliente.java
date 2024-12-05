package ex1;

public class Cliente {
    private String nome, cpf, resultado;
    
    public String mostrarDados(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        
        this.resultado = "Nome: " + this.nome + "\nCPF: " + this.cpf;
        return this.resultado;
    }
    
    public String mostrarNome(String nome){
        this.nome = nome;
        return this.nome;
    }
}
