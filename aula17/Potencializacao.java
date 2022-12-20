package aula17;

import java.util.Scanner;

public class Potencializacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, n, res = 1;

        System.out.println("Digite a base: ");
        a = scan.nextInt();

        System.out.println("Digite a potencia: ");
        n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            res = res * a;
        }

        System.out.println("Resultado: " + res);

    }
}
