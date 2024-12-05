package ex4;

public class CalcularTab {
    private double num;
    private String resultado ="";
    
    public String CalcTab(double num){
        this.num = num;
        for(int i = 1; i<=10; i++){
            this.resultado += i + " x " + this.num + " = " + i*this.num + "\n";
        }
        return this.resultado;
    }
}
