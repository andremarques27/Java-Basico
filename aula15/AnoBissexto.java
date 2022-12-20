package aula15;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if (ano % 400 == 0) {
            System.out.println(ano + " e bissexto.");
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println(ano + " e bissexto.");
        }else {
            System.out.println(ano + " nao e bissexto.");
        }

    }
}
