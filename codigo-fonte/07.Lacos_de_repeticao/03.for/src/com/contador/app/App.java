package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = leia.nextInt();

        // laço de repetição
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        leia.close();
    }
}
