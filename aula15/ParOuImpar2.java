package aula15;

import java.util.Scanner;

public class ParOuImpar2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        int resultado = 0;

        System.out.println("Digite a operacao desejada: ");
        String operacao = scan.next();

        boolean valida = true;

        switch (operacao) {
            case "+" -> resultado = valor1 + valor2;
            case "-" -> resultado = valor1 - valor2;
            case "*" -> resultado = valor1 * valor2;
            case "/" -> resultado = valor1 / valor2;
            default -> {
                System.out.println("Operacao invalida!");
                valida = false;
            }
        }

        if (valida) {

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("Resultado positivo");
            } else {
                System.out.println("Resultado negativo");
            }

            if (resultado % 2 == 0) {
            System.out.println("Resultado e par");
            } else {
            System.out.println("Resultado e impar");
            }
        }

    }
}
