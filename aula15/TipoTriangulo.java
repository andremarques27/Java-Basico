package aula15;

import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triangulo: ");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triangulo e equilatero.");
            } else if (lado1 == lado2 || lado2 == lado3) {
                System.out.println("O triangulo e isosceles");
            } else {
                System.out.println("O triangulo e escaleno.");
            }
        } else {
            System.out.println("Os valores digitados nao caracterizam um triangulo.");
        }

    }
}
