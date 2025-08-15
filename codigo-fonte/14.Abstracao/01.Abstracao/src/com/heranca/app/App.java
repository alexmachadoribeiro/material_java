package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando as classes
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica("", "", "", "", "");
        PessoaJuridica empresa = new PessoaJuridica("", "", "", "", "", "");

        // definindo os atributos da pessoa física
        System.out.println("Informe seu nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe seu CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe seu e-mail:");
        usuario.email = leia.nextLine();
        System.out.println("Informe seu telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe seu endereço:");
        usuario.endereco = leia.nextLine();

        // definindo os atributos da pessoa jurídica
        System.out.println("Informe a Razão Social da empresa:");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o Nome Fantasia da empresa:");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o CNPJ da empresa:");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o e-mail da empresa:");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone da empresa:");
        empresa.telefone = leia.nextLine();
        System.out.println("Informe o endereço da empresa:");
        empresa.endereco = leia.nextLine();

        // exibindo os dados do usuário e da empresa
        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());

        leia.close();
    }
}
