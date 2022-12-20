package aula15;

import java.util.Scanner;

public class MediaAprovacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as duas notas do aluno: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media <= 10) {
            System.out.println(media);
            System.out.println("Aluno aprovado!");
        } else if (media < 7 && media >= 4 ) {
            System.out.println(media);
            System.out.println("Aluno em recuperacao!");
        } else if (media < 4) {
            System.out.println(media);
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Nota invalida!");
        }

    }
}
