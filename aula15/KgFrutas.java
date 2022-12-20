package aula15;

import java.util.Scanner;

public class KgFrutas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Kg de morango? ");
        double kgMorango = scan.nextDouble();
        System.out.println("Quantos Kg de maca? ");
        double kgMaca = scan.nextDouble();

        if (kgMorango <= 5 && kgMaca <= 5 ) {
            double valorMorango = kgMorango * 2.50;
            double valorMaca = kgMaca * 1.80;
            double kgTotal = kgMorango + kgMaca;
            double precoTotal = valorMorango + valorMaca;
            if (kgTotal > 8 || precoTotal > 25) {
                double desconto = precoTotal / 100 * 10;
                double precoDesconto = precoTotal - desconto;
                System.out.println("Prco a pagar: " + precoDesconto);
            } else {
                System.out.println("Preco a pagar: " + precoTotal);
            }
        } else if (kgMorango > 5 && kgMaca > 5) {
            double valorMorango = kgMorango * 2.20;
            double valorMaca = kgMaca * 1.50;
            double kgTotal = kgMorango + kgMaca;
            double precoTotal = valorMorango + valorMaca;
            if (kgTotal > 8 || precoTotal > 25) {
                double desconto = precoTotal / 100 * 10;
                double precoDesconto = precoTotal - desconto;
                System.out.println("Prco a pagar: " + precoDesconto);
            } else {
                System.out.println("Preco a pagar: " + precoTotal);
            }
        } else if (kgMorango <= 5 && kgMaca > 5) {
            double valorMorango = kgMorango * 2.50;
            double valorMaca = kgMaca * 1.50;
            double kgTotal = kgMorango + kgMaca;
            double precoTotal = valorMorango + valorMaca;
            if (kgTotal > 8 || precoTotal > 25) {
                double desconto = precoTotal / 100 * 10;
                double precoDesconto = precoTotal - desconto;
                System.out.println("Prco a pagar: " + precoDesconto);
            } else {
                System.out.println("Prco a pagar: " + precoTotal);
            }
        } else {
            double valorMorango = kgMorango * 2.20;
            double valorMaca = kgMaca * 1.80;
            double kgTotal = kgMorango + kgMaca;
            double precoTotal = valorMorango + valorMaca;
            if (kgTotal > 8 || precoTotal > 25) {
                double desconto = precoTotal / 100 * 10;
                double precoDesconto = precoTotal - desconto;
                System.out.println("Prco a pagar: " + precoDesconto);
            } else {
                System.out.println("Prco a pagar: " + precoTotal);
            }
        }

    }
}
