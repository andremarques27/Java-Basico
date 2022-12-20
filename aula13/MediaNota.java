package aula13;

import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        System.out.println("Nota do 1 bimestre: ");
        float nota = scan.nextFloat();
        System.out.println("Nota do 2 bimestre: ");
        float nota2 = scan.nextFloat();
        System.out.println("Nota do 3 bimestre: ");
        float nota3 = scan.nextFloat();
        System.out.println("Nota do 4 bimestre: ");
        float nota4 = scan.nextFloat();

        float media = (nota + nota2 + nota3 + nota4) / 4;
        System.out.println("A media do aluno e: " + media);

    }
}
