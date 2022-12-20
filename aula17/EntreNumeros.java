package aula17;

import java.util.Scanner;

public class EntreNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um segundo numero: ");
        int num2 = scan.nextInt();

        int num11 = 0;
        int num21 = 0;

        if (num1 > num2) {

            num1--;
            do {
                System.out.println(num1);
                num11 += num1;
                num1--;
            }while (num1 > num2);
        }

        System.out.println("A soma dos valores interiores: " + num11);

        if (num2 > num1) {
            num2--;
            do {
                System.out.println(num2);
                num21 += num2;
                num2--;
            }while (num2 > num1);
        }

        System.out.println("A soma dos valores interiores: " + num21);

    }
}
