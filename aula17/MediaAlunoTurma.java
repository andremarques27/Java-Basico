package aula17;

import java.util.Scanner;

public class MediaAlunoTurma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Alunos turma 1: ");
        int turma1 = scan.nextInt();
        System.out.println("Alunos turma 2: ");
        int turma2 = scan.nextInt();
        System.out.println("Alunos turma 3: ");
        int turma3 = scan.nextInt();
        System.out.println("Alunos turma 4: ");
        int turma4 = scan.nextInt();
        System.out.println("Alunos turma 5: ");
        int turma5 = scan.nextInt();

        int media = turma1 + turma2 + turma3 + turma4 + turma5;

        System.out.println("Amedia e: " + media / 5);

    }
}
