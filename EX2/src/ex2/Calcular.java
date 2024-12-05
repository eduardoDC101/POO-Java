package ex2;

public class Calcular {
    private double nota1, nota2, md;
    
    public String calcMedia(double nota1, double nota2){
        try{
            this.nota1 = nota1;
            this.nota2 = nota2;

            this.md = ((this.nota1+this.nota2)/2);

            if(this.md >=6){
               return "Aprovado!!!";
            }
            if(this.md <6 && this.md >=4){
                return "Recuperação!!!";
            }
            else{
                return "Reprovado!!!";
            }
        }
        catch(Exception e){
            return "ERRO no método!!!";
        }
    }
    
    
}
