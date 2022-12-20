package aula19;

import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] agenda = new int[31][25];
        int dia = 0;
        int hora = 0;

        System.out.println("Digite o dia do compromisso: ");
        agenda[dia][hora] = scan.nextInt();
        System.out.println("Digite a hora do comprimisso: ");
        agenda[dia][hora] = scan.nextInt();
        System.out.println("Digite o compromisso: ");
        String compromisso = scan.next();
    }
}