package testevogal;

public class Verificar {
    private String frase;
    private int a,e,i,o,u, contador;
    
    public String MostrarVogais(String frase){
        this.frase = frase;
        for(int cont = 0; cont < this.frase.length(); cont++){
            char letra;
            letra = this.frase.charAt(cont);
            if(letra == 'a' || letra == 'A'){
                a += 1;
            }
            if(letra == 'e' || letra == 'E'){
                e += 1;
            }
            if(letra == 'i' || letra == 'I'){
                i += 1;
            }
            if(letra == 'o' || letra == 'O'){
                o += 1;
            }
            if(letra == 'u' || letra == 'U'){
                u += 1;
            }
        }
        String result;
        result = "A Frase foi: " +this.frase+ "\nTotal de caracteres na frase:\n" + this.frase.length() + "\n" + 
                "Letras A: " + a  + "\nLetras E: " + e + "\nLetras I: " + i + 
                "\nLetras O: " + o + "\nLetras U: " + u;
        return result;
    }
}
