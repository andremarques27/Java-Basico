package aula13;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double raio = Math.pow(lado, 2) * 2;
        System.out.println("O dobro da area do quadrado digitado e: " + raio);

    }
}
