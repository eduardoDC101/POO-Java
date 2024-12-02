package aula01;

public class Aula01 {

    public static void main(String[] args) {
       Cliente01 cliente = new Cliente01();
       
       System.out.println("==== Chamando os Métodos do Objeto ====\n");
       
       cliente.MostrarDados("Eduardo Dourado da Cruz", "493.234.452-11");
       cliente.MostrarDados("Carlos Daniel da Silva", "462.134.145-11");
       cliente.MostrarNome("Prof. Ivan");
       cliente.MostrarNome("Prof. Gobbi");
       
       System.out.println("==== Fim da Chamada aos métodos do objeto ====\n");
    
    } //Fecha main
    
}// Fecha Classe
