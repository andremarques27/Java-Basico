package aula15;

import java.util.Scanner;

public class MelhorCompra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor dos 3 produtos: ");
        double produto1 = scan.nextDouble();
        double produto2 = scan.nextDouble();
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O de " + produto1 + " e o mais barato!");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O de " + produto2 + " e o mais barato!");
        } else {
            System.out.println("O de " + produto3 + " e o mais barato!");
        }

    }
}
