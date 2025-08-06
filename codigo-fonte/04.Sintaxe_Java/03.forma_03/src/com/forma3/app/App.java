package com.forma3.app;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        // Tipos primitivos em Java: int, double, boolean, char, etc.
        String nome = "Fulano";
        int idade = 30;
        double altura = 1.75;
        boolean doador = true;

        // Exibição das variáveis
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.printf("Doador? %b%n", doador);
    }
}
