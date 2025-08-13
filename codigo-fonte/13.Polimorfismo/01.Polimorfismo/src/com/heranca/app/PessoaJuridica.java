package com.heranca.app;

public class PessoaJuridica extends Pessoa {
    // atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String cumprimentar() {
        return "Olá, somos a empresa " + this.razaoSocial + " (nome fantasia: " + this.nomeFantasia + "), nosso CNPJ é " + this.cnpj + ", nosso e-mail é " + super.email + ", nosso telefone é " + super.telefone + " e nosso endereço é " + super.endereco + ".";
    }
}
