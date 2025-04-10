package br.com.avaliacao_1.dao;
import java.sql.*;

public class ConexaoDAO {
    //Criando um atributo do tipo Connection que servira para guardar a conexao com o banco de dados
    
    /* Criando atribudo do tipo connection para guardar a conexão com o Banco 
    de Dados */
    public static Connection con = null;
    
    //** Método construtor da classe ... */
    public ConexaoDAO(){
    }
    
    public static void ConnectDB(){
        try {
            //Dados para conectar com o Banco de Dados Postgres
            String dsn = "avaliacao_1"; //nome do BD (igual o do Postgres/PgAdm)
            String user = "postgres"; //nome do user usado pra se conectar
            String senha = "postdba"; // senha do user acima
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if (con == null){
                System.out.println("erro ao abrir o banco de dados.");
            }
        }
        catch (Exception e){
            System.out.println("Prolema ao abrir a base de dados!  " + e.getMessage());
        }
    }
    
    public static void CloseDB(){
        try {
            con.close();
        }
        catch(Exception e){
            System.out.println("Problema ao fechar a base de dados!" + e.getMessage());
        }
    }    
}


