package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.println("Informe um número inteiro:");
        n = leia.nextInt();

        // laço de repetição enquanto (while)
        while (n >= 0) {
            System.out.println(n);
            n--;
        }

        leia.close();
    }
}
