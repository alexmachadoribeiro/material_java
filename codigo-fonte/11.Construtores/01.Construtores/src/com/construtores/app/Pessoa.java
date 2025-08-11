package com.construtores.app;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa() {
    }

    // construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
