package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        // estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } 
        else {
            System.out.println(nome + " é menor de idade.");
        }

        leia.close();
    }
}
