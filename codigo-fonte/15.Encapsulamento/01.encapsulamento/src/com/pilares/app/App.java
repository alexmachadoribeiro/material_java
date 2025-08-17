package com.pilares.app;

import com.pilares.model.PessoaFisica;
import com.pilares.model.PessoaJuridica;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);
        Scanner leia = new Scanner(System.in);

        // input do usuário
        System.out.println("Informe os dados do usuário:\n");
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe a data de nascimento:");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("Informe o e-mail:");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        usuario.setEndereco(leia.nextLine());

        // input da empresa
        System.out.println("Informe os dados da empresa:\n");
        System.out.println("Informe a Razão Social:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome da empresa:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o CNPJ:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o e-mail da empresa:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone da empresa:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço da empresa:");
        empresa.setEndereco(leia.nextLine());

        // output do usuário
        System.out.println("Informações do usuário:\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());

        // output da empresa
        System.out.println("\nInformações da empresa:\n");
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());
        System.out.println("Endereço da empresa: " + empresa.getEndereco());

        leia.close();
    }
}
