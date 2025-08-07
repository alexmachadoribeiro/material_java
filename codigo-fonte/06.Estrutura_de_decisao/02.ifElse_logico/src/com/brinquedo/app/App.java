package com.brinquedo.app;

// importa Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia classe Scanner
        Scanner leia = new Scanner(System.in);

        // declara variáveis
        String nome;
        int idade;
        double altura;

        // input
        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        System.out.print("Digite sua altura: ");
        altura = leia.nextDouble();

        // estrutura de decisão com operador booleano
        if (idade >= 12 && altura >= 1.15) {
            System.out.println(nome + " pode brincar no brinquedo.");
        } 
        else {
            System.out.println(nome + " não atende aos requisitos para brincar no brinquedo.");
        }

        // fecha o Scanner
        leia.close();
    }
}
