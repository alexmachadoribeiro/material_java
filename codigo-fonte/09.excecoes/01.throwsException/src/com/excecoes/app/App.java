package com.excecoes.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.println("Informe um número inteiro:");
        n = leia.nextInt();

        System.out.println("Você digitou: " + n);

        leia.close();
    }
}
