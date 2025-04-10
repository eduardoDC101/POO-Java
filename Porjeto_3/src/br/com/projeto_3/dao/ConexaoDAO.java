package br.com.projeto_3.dao;

import java.sql.*;

public class ConexaoDAO {
    //Criando um atributo do tipo Connection que servira para guardar a conexao com o banco de dados
    
    public static Connection con = null;
    
    //** Método construtor da classe ... */
    public ConexaoDAO(){
    }
    
    public static void ConnectDB(){
        try {
            String dsn = "projeto_3";
            String user = "postgres";
            String senha = "postdba";
            
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

