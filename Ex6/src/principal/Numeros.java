package principal;

public class Numeros {
    private int numero, soma;
    
    public void Somatoria(int numero){
        this.numero = numero;
        this.soma +=numero;
    }
    
    public int mostrarSoma(){
        return this.soma;
    }
}
