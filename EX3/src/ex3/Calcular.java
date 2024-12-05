package ex3;

public class Calcular {
    private String sinal;
    private double n1,n2, resultado;
    
    public double calcResultado(String sinal, double n1, double n2){
        this.sinal = sinal;
        this.n1 = n1;
        this.n2 = n2;
        
        switch(this.sinal){
            case "+":
                this.resultado = this.n1+this.n2;
                break;
            case "-":
                this.resultado = this.n1-this.n2;
                break;
            case "*":
                this.resultado = this.n1*this.n2;
                break;
            case "/":
                this.resultado = this.n1/this.n2;
                break;
            default:
                this.resultado = 0;
                break;
        }
        return this.resultado;
    }
}


