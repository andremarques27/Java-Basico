package aula17;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Digite uma valida(0-10): ");
            nota = scan.nextDouble();
        }

        System.out.println("Nota do aluno: " + nota);

    }
}
