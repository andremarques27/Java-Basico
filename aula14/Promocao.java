package aula14;

import java.util.Scanner;

public class Promocao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Muito barato!");
        } else if (valor <= 15 ) {
            System.out.println("Pedir desconto!");
        } else if (valor <= 17) {
            System.out.println("Pesquise mais!");
        } else {
            System.out.println("Muito caro!");
        }

    }
}
