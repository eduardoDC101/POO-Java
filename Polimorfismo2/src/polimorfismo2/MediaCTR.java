package polimorfismo2;

public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public void calcularMedia(MediaDTO mediaDTO){
        mediaDAO.calcularMedia(mediaDTO);
    }
    
    public String imprimir(){
        return mediaDAO.imprimir();
    }
}
