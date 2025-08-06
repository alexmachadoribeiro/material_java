package com.formatted.app;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        // Tipos primitivos em Java: int, double, boolean, char, etc.
        String nome = "Fulano";
        int idade = 30;
        double altura = 1.75;
        boolean doador = true;

        // Exibição das variáveis
        System.out.println("Nome: %s".formatted(nome));
        System.out.println("Idade: %d".formatted(idade));
        System.out.println("Altura: %.2f".formatted(altura));
        System.out.println("Doador? %b".formatted(doador));
    }
}