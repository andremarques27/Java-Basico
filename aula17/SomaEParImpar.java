package aula17;

import java.util.Scanner;

public class SomaEParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");
        int nun1 = scan.nextInt();
        int nun2 = scan.nextInt();
        int nun3 = scan.nextInt();
        int nun4 = scan.nextInt();
        int nun5 = scan.nextInt();
        int nun6 = scan.nextInt();
        int nun7 = scan.nextInt();
        int nun8 = scan.nextInt();
        int nun9 = scan.nextInt();
        int nun10 = scan.nextInt();

        int soma = nun1 + nun2 + nun3 + nun4 + nun5 + nun6 + nun7 + nun8 + nun9 + nun10;
        System.out.println("A soma dos numeros e " + soma);

        if (nun1%2 != 0) {
            System.out.println("Numero 1 e impar");
        }else {
            System.out.println("Numero 1 e par");
        }

        if (nun2%2 != 0) {
            System.out.println("Numero 2 e impar");
        }else {
            System.out.println("Numero 2 e par");
        }

        if (nun3%2 != 0) {
            System.out.println("Numero 3 e impar");
        }else {
            System.out.println("Numero 3 e par");
        }

        if (nun4%2 != 0) {
            System.out.println("Numero 4 e impar");
        }else {
            System.out.println("Numero 4 e par");
        }

        if (nun5%2 != 0) {
            System.out.println("Numero 5 e impar");
        }else {
            System.out.println("Numero 5 e par");
        }

        if (nun6%2 != 0) {
            System.out.println("Numero 6 e impar");
        }else {
            System.out.println("Numero 6 e par");
        }

        if (nun7%2 != 0) {
            System.out.println("Numero 7 e impar");
        }else {
            System.out.println("Numero 7 e par");
        }

        if (nun8%2 != 0) {
            System.out.println("Numero 8 e impar");
        }else {
            System.out.println("Numero 8 e par");
        }

        if (nun9%2 != 0) {
            System.out.println("Numero 9 e impar");
        }else {
            System.out.println("Numero 9 e par");
        }

        if (nun10%2 != 0) {
            System.out.println("Numero 10 e impar");
        }else {
            System.out.println("Numero 10 e par");
        }

    }
}
