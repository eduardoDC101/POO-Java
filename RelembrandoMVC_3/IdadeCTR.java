package ex3;

public class IdadeCTR {
   IdadeDAO idadeDAO = new IdadeDAO();
   
   public String testeIdade(IdadeDTO idadeDTO){
       return idadeDAO.testeIdade(idadeDTO);
   }
}
