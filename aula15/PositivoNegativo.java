package aula15;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor > 0) {
            System.out.println("Valor positivo!");
        } else if (valor < 0) {
            System.out.println("Valor negativo!");
        } else {
            System.out.println("0 e um valor neutro!");
        }

    }
}
