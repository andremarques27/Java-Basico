package aula17;

import java.util.Scanner;

public class NumeroPrimo2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 2;

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        do {
            if (i == 2 | i == 3 | i== 5 | i == 7) {
                System.out.println(i);
            }

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            } else {
                System.out.println(i);
            }
            i++;
        }while (i < valor);

    }
}