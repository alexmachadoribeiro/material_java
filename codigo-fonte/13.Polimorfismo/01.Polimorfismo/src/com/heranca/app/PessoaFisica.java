package com.heranca.app;

public class PessoaFisica extends Pessoa {
    // atributos
    public String nome;
    public String cpf;

    public PessoaFisica(String nome, String cpf, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + ", meu CPF é " + this.cpf + ", meu e-mail é " + super.email + ", meu telefone é " + super.telefone + " e meu endereço é " + super.endereco + ".";
    }
}
