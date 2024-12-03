package aula06;

public class Tabuada {
    private double numero;
    private String resposta = "";
    
    public String FazerTabuada(Double numero){
        try{
            this.numero = numero;
            for(int i = 1; i<=10; i++){
                this.resposta += this.numero + " x " + i + " = " + i*this.numero + "\n";
            }
            return this.resposta;
        }
        catch(Exception e){
            return this.resposta;
        }
    }
}
