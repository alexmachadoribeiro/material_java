package com.heranca.app;

abstract public class Pessoa {
    // atributos
    public String email;
    public String telefone;
    public String endereco;

    public Pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String cumprimentar() {
        return "Moro em " + this.endereco + ", meu telefone é " + this.telefone + " e meu email é " + this.email + ".";
    }
}
