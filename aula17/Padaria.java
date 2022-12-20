package aula17;

import java.util.Scanner;

public class Padaria {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos paes o cliente comprou? ");
    int paes = scan.nextInt();

    do {
        System.out.println("Limite de 50 paes por cliente.");
        System.out.println("Quantos paes o cliente comprou? ");
        paes = scan.nextInt();
    } while (paes > 50);

    double valor = paes * 0.18;

    System.out.println("O valor a pagar e: R$" + valor);

}
}
