package com.pessoa.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // intancia as classes
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // lê os dados da pessoa
        System.out.print("Nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Idade: ");
        usuario.idade = leia.nextInt();
        System.out.print("Altura: ");
        usuario.altura = leia.nextDouble();

        // exibe os dados da pessoa
        usuario.exibirDados();

        leia.close();
    }
}
