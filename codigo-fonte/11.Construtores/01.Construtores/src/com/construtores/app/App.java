package com.construtores.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia das classes
        Pessoa usuario = new Pessoa("", 0, 0.0);
        Scanner leia = new Scanner(System.in);

        // entrada de dados
        System.out.print("Nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Idade: ");
        usuario.idade = leia.nextInt();
        System.out.print("Altura: ");
        usuario.altura = leia.nextDouble();

        // exibe os dados
        System.out.println("Nome: " + usuario.nome);
        System.out.println("Idade: " + usuario.idade);
        System.out.println("Altura: " + usuario.altura);

        leia.close();
    }
}
