package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;
        double altura;

        // input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura:");
        altura = leia.nextDouble();

        // fecha objeto do tipo Scanner
        leia.close();
    }
}
