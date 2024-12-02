package aula02;

public class Registrar {
    private String nome;
    private int idade;
    double salario;
    
    public String nome(String nome){
        this.nome = nome;
        String mensagem = "Nome não registrado";
        if (this.nome.equalsIgnoreCase("")){
            return mensagem;
        }
        else{
            return this.nome;
        }
    }//Fim do método nome
    
    public String idade(int idade){
        this.idade = idade;
        String idademsg;
        if(this.idade >= 18){
            idademsg = "Maior de Idade";
            return idademsg;
        }
        else{
            idademsg = "Menor de Idade";
            return idademsg;
        }
    }//Fim do método idade
    
    public double salario(double salario){
        this.salario = salario;
        double salmin = 1412;
        double media;
        if(this.salario <= 0){
            return 0;
        }
        else{
            media = this.salario/salmin;
            return media;
        }
    }
    
} //fim da classe Registrar
