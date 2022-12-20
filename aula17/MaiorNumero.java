package aula17;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = scan.nextInt();
        System.out.println("Digite o quarto numero: ");
        int num4 = scan.nextInt();
        System.out.println("Digite o quinto numero: ");
        int num5 = scan.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5;
        float media = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("A soma dos numeros: " + soma);
        System.out.println("A media dos numeros: " + media);

    }
}
