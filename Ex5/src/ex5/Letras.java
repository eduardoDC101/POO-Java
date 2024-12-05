package ex5;

public class Letras {
    private String letra, total;
    private int qtdVogal, qtdCon, qtdtotal;
    
    public void recebeLetras(String letra){
        this.letra = letra;
        
        if(!this.letra.equalsIgnoreCase("a")&& !this.letra.equalsIgnoreCase("e")&&
                !this.letra.equalsIgnoreCase("i")&& !this.letra.equalsIgnoreCase("o")&& 
                !this.letra.equalsIgnoreCase("u")){
            
            if (this.letra.equalsIgnoreCase("x")){
                this.qtdCon +=0;
            }
            else{
                this.qtdCon +=1;
            }
        } else {
           this.qtdVogal +=1;
        }
    }
    
    public String Resultado(){
        this.qtdtotal = this.qtdCon + this.qtdVogal;
        this.total = "Vogais Digitadas: " + this.qtdVogal + "\nConsoantes Digitadas: " +
                this.qtdCon + "\nTotal de letras: " + this.qtdtotal;
       
        return this.total;
    }
}
