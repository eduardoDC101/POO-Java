package ex1;

public class Registro {

    public static void main(String[] args) {
      Cliente cliente = new Cliente();
      
      System.out.println(cliente.mostrarNome("Eduardo Dourado"));
      System.out.println(cliente.mostrarNome("André Gobbi"));
      
      System.out.println(cliente.mostrarDados("Eduardo Dourado", "123.123.123-12"));
      System.out.println(cliente.mostrarDados("André Gobbi", "234.234.234-21"));
    }
    
}
