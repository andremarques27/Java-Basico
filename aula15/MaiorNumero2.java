package aula15;

import java.util.Scanner;

public class MaiorNumero2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
            System.out.println(Math.min(numero2, numero3));
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
            System.out.println(Math.min(numero1, numero3));
        } else {
            System.out.println(numero3);
            System.out.println(Math.min(numero1, numero2));
        }

    }
}
