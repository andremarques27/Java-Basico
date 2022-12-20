package aula17;

import java.util.Scanner;

public class Loja199 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos itens o cliente comprou? ");
        int itens = scan.nextInt();

        do {
            System.out.println("Limite de 50 itens por cliente.");
            System.out.println("Quantos itens o cliente comprou? ");
            itens = scan.nextInt();
        } while (itens > 50);

        double valor = itens * 1.99;

        System.out.println("O valor a pagar e: R$" + valor);

    }
}
