package aula04;

public class Tabuada {
    private int numero;
    private String resultado = "";
    
    public String CalcTabuada(int numero){
        this.numero = numero;
        for(int i = 1; i<=20; i++){
            this.resultado += i + " x " + this.numero + " = " + this.numero*i + "\n";
        }
        return this.resultado;
    }
}


