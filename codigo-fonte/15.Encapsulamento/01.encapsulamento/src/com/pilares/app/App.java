package com.pilares.app;

import com.pilares.model.PessoaFisica;
import com.pilares.model.PessoaJuridica;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);
        Scanner leia = new Scanner(System.in);

        leia.close();
    }
}
