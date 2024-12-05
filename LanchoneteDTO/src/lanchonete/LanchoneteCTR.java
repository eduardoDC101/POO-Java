package lanchonete;

public class LanchoneteCTR {
    LanchoneteDAO lanchoneteDAO = new LanchoneteDAO();
    
    public String mostrarMenu(){
        return lanchoneteDAO.mostrarMenu();
    }
    
    public void receberCodigo(LanchoneteDTO lanchoneteDTO){
        lanchoneteDAO.receberCodigo(lanchoneteDTO);
    }
    
    public String retornarConta(LanchoneteDTO lanchoneteDTO){
        return lanchoneteDAO.retornarConta(lanchoneteDTO);
    }
}
