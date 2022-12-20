package aula15;

import java.util.Scanner;

public class NotaEscola {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = scan.nextDouble();

        if (nota >= 9) {
            System.out.println("A");
            System.out.println("Aprovado");
        } else if (nota >= 7.5) {
            System.out.println("B");
            System.out.println("Aprovado");
        } else if (nota >= 6) {
            System.out.println("C");
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("D");
            System.out.println("Reprovado");
        } else {
            System.out.println("E");
            System.out.println("Reprovado");
        }

    }
}
