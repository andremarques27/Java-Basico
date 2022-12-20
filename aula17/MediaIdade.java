package aula17;

import java.util.Scanner;

public class MediaIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade de 5 pessoas: ");
        int idade1 = scan.nextInt();
        int idade2 = scan.nextInt();
        int idade3 = scan.nextInt();
        int idade4 = scan.nextInt();
        int idade5 = scan.nextInt();

        int media = (idade1 + idade2 + idade3 + idade4 + idade5) / 5;

        if (media < 25) {
            System.out.println("A turma tem a media de " + media + " anos, uma turma jovem.");
        } else if (media < 60) {
            System.out.println("A turma tem a media de " + media + " anos, uma turma adulta.");
        }else {
            System.out.println("A turma tem a media de " + media + " anos, uma turma idosa..");
        }

    }
}
