package aula15;

import java.util.Objects;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 2 valores: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;
        int subtrair = numero1 - numero2;

        System.out.println("Voce quer somar(+) ou subtrair(-)? ");
        String operacao = scan.next();

        if (soma > 0 || subtrair > 0) {
            if (Objects.equals(operacao, "+") && soma % 2 == 0) {
                System.out.println("A soma dos valores e: " + soma);
                System.out.println("Os valores somadoss e par.");
                System.out.println("Os valores sao positivos.");
            } else if (Objects.equals(operacao, "+")) {
                System.out.println("A soma dos valores e: " + soma);
                System.out.println("Os valores somados e impar.");
                System.out.println("Os valores sao positivos.");
            } else if (Objects.equals(operacao, "-") && subtrair % 2 == 0) {
                System.out.println("A subtracao dos valores e: " + subtrair);
                System.out.println("Os valores subtraidos e par.");
                System.out.println("Os valores sao positivos.");
            } else {
                System.out.println("A subtracao dos valores e " + subtrair);
                System.out.println("Os valores subtraidos e impar.");
                System.out.println("Os valores sao positivos.");
            }
        } else {
            if (Objects.equals(operacao, "+") && soma % 2 == 0) {
                System.out.println("A soma dos valores e: " + soma);
                System.out.println("Os valores somadoss e par.");
                System.out.println("Os valores sao negativos.");
            } else if (Objects.equals(operacao, "+")) {
                System.out.println("A soma dos valores e: " + soma);
                System.out.println("Os valores somados e impar.");
                System.out.println("Os valores sao negativos.");
            } else if (Objects.equals(operacao, "-") && subtrair % 2 == 0) {
                System.out.println("A subtracao dos valores e: " + subtrair);
                System.out.println("Os valores subtraidos e par.");
                System.out.println("Os valores sao negativos.");
            } else {
                System.out.println("A subtracao dos valores e " + subtrair);
                System.out.println("Os valores subtraidos e impar.");
                System.out.println("Os valores sao negativos.");
            }
        }

    }
}
