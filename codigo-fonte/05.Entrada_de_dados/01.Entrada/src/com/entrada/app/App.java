package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome, email;
        int idade;
        double altura;

        // input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura:");
        altura = leia.nextDouble();
        System.out.println("Informe seu e-mail:");
        email = leia.nextLine();

        // output
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("E-mail: " + email);

        // fecha objeto do tipo Scanner
        leia.close();
    }
}
