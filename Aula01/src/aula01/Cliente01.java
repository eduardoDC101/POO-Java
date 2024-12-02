package aula01;

public class Cliente01 {
    private String nome, rg;
    
    public void MostrarDados(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        System.out.println("O nome informado foi: " + this.nome + 
                "\nO RG informado foi: " + this.rg);
        
    } // Fecha método MostrarDados
    
    public void MostrarNome(String nome){
        this.nome = nome;
        System.out.println("O nome informado foi: " + this.nome );
    }//Fecha o método MostrarNome
    
}// Fecha a classe Cliente01
