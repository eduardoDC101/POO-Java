package br.com.avaliacao_1.dto;

public class ClienteDTO {
    private String nome_cli, telefone_cli, cpf_cli, logradouro_cli;
    private String cidade_cli, servico_cli;
    private int numero_cli, id_cli;

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getTelefone_cli() {
        return telefone_cli;
    }

    public void setTelefone_cli(String telefone_cli) {
        this.telefone_cli = telefone_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getLogradouro_cli() {
        return logradouro_cli;
    }

    public void setLogradouro_cli(String logradouro_cli) {
        this.logradouro_cli = logradouro_cli;
    }

    public String getCidade_cli() {
        return cidade_cli;
    }

    public void setCidade_cli(String cidade_cli) {
        this.cidade_cli = cidade_cli;
    }

    public String getServico_cli() {
        return servico_cli;
    }

    public void setServico_cli(String servico_cli) {
        this.servico_cli = servico_cli;
    }

    public int getNumero_cli() {
        return numero_cli;
    }

    public void setNumero_cli(int numero_cli) {
        this.numero_cli = numero_cli;
    }
}
