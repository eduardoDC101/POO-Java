package br.com.projeto_3.ctr;

import java.sql.ResultSet;
import br.com.projeto_3.dto.FornecedorDTO;
import br.com.projeto_3.dto.ProdutoDTO;
import br.com.projeto_3.dao.ProdutoDAO;
import br.com.projeto_3.dao.ConexaoDAO;

public class ProdutoCTR { 
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    public ProdutoCTR(){
    }
    
    public String inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            if(produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)){
                return "Produto Cadastrado com Sucesso";
            }
            else{
                return "Produto NÃO Cadastrado!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto NÃO Alterado!!!";
        }
    }
    
     public String alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            if(produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)){
                return "Produto Alterado com Sucesso";
            }
            else{
                return "Produto NÃO Alterado!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto NÃO Alterado!!!";
        }
    }
     
     public String excluirProduto(ProdutoDTO produtoDTO){
         try{
             if(produtoDAO.excluirProduto(produtoDTO)){
                return "Produto Excluído com Sucesso";
            }
            else{
                return "Produto NÃO Excluído!!!";
            }
         }
         catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto NÃO Excluído!!!";
        }
     }
     
     public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
         ResultSet rs = null;
         rs = produtoDAO.consultarProduto(produtoDTO, opcao);
         return rs;
     }
     
     public void CloseDB(){
         ConexaoDAO.CloseDB();
     }
}
