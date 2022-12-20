package aula17;

import java.util.Scanner;

public class SalarioInicial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario inicial: ");
        double salarioI = scan.nextDouble();
        System.out.println("Digite o ano atual: ");
        int ano = scan.nextInt();

        int anoC = 1995;
        double salarioA = 0;
        double salarioF = 0;
        double porcentual = 1.5;
        double porcentual2 = 1.5;

        do {
            salarioA += salarioI / 100 * porcentual2;
            salarioF = salarioI + salarioA;
            porcentual2 += porcentual * 2;
            anoC++;
        } while (anoC <= ano);

        System.out.println("O salario atual e: " + salarioF);

    }
}
