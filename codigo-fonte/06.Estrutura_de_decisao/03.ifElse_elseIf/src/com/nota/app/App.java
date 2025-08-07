package com.nota.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        double nota;

        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite sua nota: ");
        nota = leia.nextDouble();

        // verifica se a nota é válida e classifica o aluno
        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println(nome + ", você foi aprovado com a nota: " + nota);
            }
            else if (nota >= 5) {
                System.out.println(nome + ", você está de recuperação com a nota: " + nota);
            }
            else {
                System.out.println(nome + ", você foi reprovado com a nota: " + nota);
            }
        } 
        else {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
        }
        
        leia.close();
    }
}
