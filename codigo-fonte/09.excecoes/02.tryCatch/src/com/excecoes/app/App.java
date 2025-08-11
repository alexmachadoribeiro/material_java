package com.excecoes.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n;

        // tratamento de exceções
        try {
            System.out.println("Informe um número inteiro:");
            n = leia.nextInt();
            System.out.println("Você digitou: " + n);
        } 
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        leia.close();
    }
}
