package aula17;

import java.util.Scanner;

public class TabuadaPersonalizada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada;
        int inicio;
        int fim;

        do {
            System.out.println("Digite a tabuada: ");
            tabuada = scan.nextInt();
            System.out.println("Comecar de: ");
            inicio = scan.nextInt();
            System.out.println("Terminar em: ");
            fim = scan.nextInt();

            if (inicio > fim) {
                System.out.println("Inicio maior que final.");
            }

        } while (inicio > fim);

        System.out.println("Vou mostrar a tabuada de " + tabuada + " comecando em " + inicio + " ate o " + fim + ":");

        int tabuadaX;

        do {
            tabuadaX = tabuada * inicio;
            System.out.println(inicio + " x " + tabuada + " = " + tabuadaX);
            inicio++;
        } while (inicio <= fim);

    }
}
