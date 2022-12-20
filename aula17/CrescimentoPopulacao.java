package aula17;

import java.util.Scanner;

public class CrescimentoPopulacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a populacao do primeiro Pais: ");
        double paisA = scan.nextDouble();
        System.out.println("Digite a taxa de crscimento do primeiro Pais: ");
        double crescimento1 = scan.nextDouble();
        System.out.println("Digite a populacao do segundo Pais: ");
        double paisB = scan.nextDouble();
        System.out.println("Digite a taxa de populacao do segundo Pais");
        double crescimento2 = scan.nextDouble();
        int anos = 0;

        if (paisA < paisB) {
            do {
                paisA += paisA / 100 * crescimento1;
                paisB += paisB / 100 * crescimento2;
                anos++;
            } while (paisA < paisB);
        } else {
            do {
                paisA += paisA / 100 * crescimento1;
                paisB += paisB / 100 * crescimento2;
                anos++;
            } while (paisB < paisA);
        }

        System.out.println("Total de anos necessarios: " + anos);

    }
}
