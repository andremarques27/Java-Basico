package aula15;

import java.util.Objects;
import java.util.Scanner;

public class GasolinaAlcool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ira abastecer com alcoo(A) ou gasolina(G)? ");
        String combustivel = scan.next();
        System.out.println("Quantos litros ira abastecer? ");
        double litros = scan.nextDouble();

        if (Objects.equals(combustivel, "A")) {
            if (litros <= 20) {
                double preco = litros * 1.90;
                double precoDesconto = preco / 100 * 3;
                double precoFinal = preco - precoDesconto;
                System.out.println("Valor original: " + preco);
                System.out.println("Valor do desconto: " + precoDesconto);
                System.out.println("Valor a pagar: " + precoFinal);
            } else {
                double preco = litros * 1.90;
                double precoDesconto = preco / 100 * 5;
                double precoFinal = preco - precoDesconto;
                System.out.println("Valor original: " + preco);
                System.out.println("Valor do desconto: " + precoDesconto);
                System.out.println("Valor a pagar: " + precoFinal);
            }
        } else {
            if (Objects.equals(combustivel, "G")) {
                if (litros <= 20) {
                    double preco = litros * 2.50;
                    double precoDesconto = preco / 100 * 4;
                    double precoFinal = preco - precoDesconto;
                    System.out.println("Valor original: " + preco);
                    System.out.println("Valor do desconto: " + precoDesconto);
                    System.out.println("Valor a pagar: " + precoFinal);
                } else {
                    double preco = litros * 2.50;
                    double precoDesconto = preco / 100 * 6;
                    double precoFinal = preco - precoDesconto;
                    System.out.println("Valor original: " + preco);
                    System.out.println("Valor do desconto: " + precoDesconto);
                    System.out.println("Valor a pagar: " + precoFinal);
                }
            } else {
                System.out.println("Valor invalido digite A ou G!");
            }
        }

    }
}
