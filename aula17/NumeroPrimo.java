package aula17;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        if (num == 2 | num == 3 | num == 5 | num == 7) {
            System.out.println(num + " e primo");
        } else if (num <= 1 || num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println(num + " nao e primo");
        } else {
            System.out.println(num + " e primo");
        }

    }
}
