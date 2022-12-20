package aula13;

import java.util.Scanner;

public class CalculosMatematicos2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 numeros, sendo o ultimo real: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        int resultado1 = (numero1 * 2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("Primeiro resultado: " + resultado1);
        System.out.println("Segundo resultado: " + resultado2);
        System.out.println("Terceiro resultado: " + resultado3);

    }
}
