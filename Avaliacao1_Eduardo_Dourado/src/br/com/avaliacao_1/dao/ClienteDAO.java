package br.com.avaliacao_1.dao;

import java.sql.*;
import br.com.avaliacao_1.dto.ClienteDTO;

public class ClienteDAO {
    
    public ClienteDAO(){}
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirCliente(ClienteDTO clienteDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into cliente (nome_cli, telefone_cli, logradouro_cli, "+
                    "cpf_cli, cidade_cli, servico_cli, numero_cli) values ( "+
                    "'" + clienteDTO.getNome_cli() + "', "+
                    "'" + clienteDTO.getTelefone_cli()+ "', "+
                    "'" + clienteDTO.getLogradouro_cli()+ "', "+
                    "'" + clienteDTO.getCpf_cli()+ "', "+
                    "'" + clienteDTO.getCidade_cli()+ "', "+
                    "'" + clienteDTO.getServico_cli()+ "', "+
                    "'" + clienteDTO.getNumero_cli()+ "') ";
                    
stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        try{
            
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
           String comando ="";
           switch(opcao){
                case 1: 
                    comando = "Select c.* "+
                            "from cliente c " + 
                            "where nome_cli like '" + clienteDTO.getNome_cli()+ "%' "+
                            "order by c.nome_cli";
                break;
                case 2:
                    comando = "Select c.* "+
                           "from cliente c " + 
                            "where c.id_cli = " + clienteDTO.getId_cli();
                            
                break;
                case 3:
                    comando = "Select c.id_cli, c.nome_cli "+
                            "from cliente c";
               break;
               
           }
 
           rs = stmt.executeQuery(comando.toUpperCase());
           return rs;
       }
        catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarCliente(ClienteDTO clienteDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update cliente set "+
                    "nome_cli = '" + clienteDTO.getNome_cli() + "', "+
                    "telefone_cli = '" + clienteDTO.getTelefone_cli()+ "', "+
                    "logradouro_cli = '" + clienteDTO.getLogradouro_cli()+ "', "+                   
                    "cpf_cli = '" + clienteDTO.getCpf_cli()+ "', "+
                    "cidade_cli = '" + clienteDTO.getCidade_cli()+ "', "+                
                    "servico_cli = '" + clienteDTO.getServico_cli() + "', "+
                    "numero_cli = " + clienteDTO.getNumero_cli()+ " "+
                    "where id_cli = " + clienteDTO.getId_cli();
                    
stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirCliente(ClienteDTO clienteDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from cliente where id_cli = " + 
                    clienteDTO.getId_cli();
    
stmt.execute(comando);
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
}
