package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double x, y, result;
        String operador;

        System.out.println("Informe o valor de x:");
        x = leia.nextDouble();
        System.out.println("Informe o valor de y:");
        y = leia.nextDouble();
        leia.nextLine();
        System.out.println("Informe o operador (+, -, *, /):");
        operador = leia.nextLine();

        switch (operador) {
            case "+":
                result = x + y;
                System.out.println("Resultado: " + result);
                break;
            case "-":
                result = x - y;
                System.out.println("Resultado: " + result);
                break;
            case "*":
                result = x * y;
                System.out.println("Resultado: " + result);
                break;
            case "/":
                if (y != 0) {
                    result = x / y;
                    System.out.println("Resultado: " + result);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        leia.close();
    }
}
