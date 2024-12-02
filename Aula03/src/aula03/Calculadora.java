package aula03;

public class Calculadora {
    private String sinal;
    private double resultado, n1, n2;
    
    public double Calcular(String sinal, double n1, double n2){
        this.sinal = sinal;
        this.n1 = n1;
        this.n2 = n2; 
        
        switch (this.sinal){
            case "+":
                this.resultado = this.n1+this.n2;
                return this.resultado;
            case "-":
                this.resultado = this.n1-this.n2;
                return this.resultado;
            case "*":
                this.resultado = this.n1*this.n2;
                return this.resultado;
            case "/":
                if (this.n2 != 0){
                    this.resultado = this.n1/this.n2;
                    return this.resultado;
                }
                else{
                    return 000;
                }
            default:
                return 0;
        }
    }
}
