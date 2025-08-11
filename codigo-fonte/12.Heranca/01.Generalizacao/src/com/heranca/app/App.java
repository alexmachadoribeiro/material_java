package com.heranca.app;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando a classe PessoaFiscia
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // definindo os atributos
        usuario.email = "usuario@exemplo.com";
        usuario.telefone = "1234-5678";
        usuario.endereco = "Rua A, 123";

        // exibindo os dados
        System.out.println("Email: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Endereco: " + usuario.endereco);

        // exibindo o método
        System.out.println(usuario.cumprimentar());
    }
}
