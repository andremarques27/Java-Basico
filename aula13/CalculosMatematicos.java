package aula13;

import java.util.Scanner;

public class CalculosMatematicos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 numeros, sendo o ultimo real: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        int calculo1 = numero1 * 2;
        double calculo2 = numero2 / 2;
        double resultado1 = calculo1 * calculo2;

        int calculo3 = (numero1 * 3);
        double resultado2 = (calculo3 + numero3);

        double calculo4 = Math.pow(numero3, 3);
        double resultado3 = calculo4;

        System.out.println("Primeiro resultado: " + resultado1);
        System.out.println("Segundo resultado: " + resultado2);
        System.out.println("Terceiro resultado: " + resultado3);

    }
}