package polimorfismo2;

public class MediaDAO {
    private double media = 0;
    
    public void calcularMedia(MediaDTO mediaDTO){
        switch(mediaDTO.getOpc()){
            case 1:
                calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
                break;
            case 2:
                calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
                break;
            case 3:
                calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
                break;
            default:
                this.media = 000; 
        }
    }
    
    private void calcularMedia(double n1, double n2){
        this.media = (n1+n2)/2;
    }
    
    private void calcularMedia(double n1, double n2, double n3){
        this.media = (n1+n2+n3)/3;
    }
    
    private void calcularMedia(double n1, double n2, double n3, double n4){
        this.media = (n1+n2+n3+n4)/4;
    }
    
    public String imprimir(){
        return "A média é: " + this.media;
    }
}
