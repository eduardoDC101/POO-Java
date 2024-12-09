package cinema;

public class CinemaCTR {
    CinemaDAO cinemaDAO = new CinemaDAO();
    
    public String Menu(){
        return cinemaDAO.Menu();
    }
    
    public void comprarIngresso(CinemaDTO cinemaDTO){
        cinemaDAO.comprarIngresso(cinemaDTO);
    }
    
    public String mostrarCarrinho(CinemaDTO cinemaDTO){
        return cinemaDAO.mostrarCarrinho(cinemaDTO);
    }
}
