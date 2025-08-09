package com.quadrado.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double l, a;
        int opcao;

        // laço de repetição
        do {
            // input
            System.out.println("Informa o valor do lado do quadrado:");
            l = leia.nextDouble();

            // área do quadrado
            a = l*l;

            // output
            System.out.println("Área do quadrado: " + a + ".");

            // usuário informa se encerra ou continua
            System.out.println("Deseja continuar? (1 - Sim, Qualquer número - Não)");
            opcao = leia.nextInt();
        } while (opcao == 1);

        leia.close();
    }
}
