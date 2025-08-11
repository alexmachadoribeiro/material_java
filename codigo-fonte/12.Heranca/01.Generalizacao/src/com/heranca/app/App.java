package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando as classes
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // definindo os atributos da pessoa física
        usuario.nome = "João da Silva";
        usuario.cpf = "123.456.789-00";
        usuario.email = "usuario@exemplo.com";
        usuario.telefone = "1234-5678";
        usuario.endereco = "Rua A, 123";

        // definindo os atributos da pessoa jurídica
        empresa.razaoSocial = "Empresa Exemplo Ltda";
        empresa.nomeFantasia = "Exemplo";
        empresa.cnpj = "12.345.678/0001-90";
        empresa.email = "empresa@exemplo.com";
        empresa.telefone = "9876-5432";
        empresa.endereco = "Avenida B, 456";

        // exibindo os dados do usuário
        System.out.println(usuario.cumprimentar());
        System.out.println("Dados do Usuário:");
        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.cpf);
        System.out.println("Email: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Endereco: " + usuario.endereco + "\n");

        // exibindo os dados da empresa
        System.out.println(empresa.cumprimentar());
        System.out.println("Dados da Empresa:");
        System.out.println("Razão Social: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia: " + empresa.nomeFantasia);
        System.out.println("CNPJ: " + empresa.cnpj);
        System.out.println("Email: " + empresa.email);
        System.out.println("Telefone: " + empresa.telefone);
        System.out.println("Endereco: " + empresa.endereco);

        leia.close();
    }
}
