package com.pilares.model;

final public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String email, String telefone, String endereco, String nome, String cpf, String dataNascimento) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
