package com.pessoa.app;

public class Pessoa {
    // atributos
    public String nome;
    public int idade;
    public double altura;

    // métodos
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }
}
