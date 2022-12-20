package aula17;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = scan.nextInt();
        int fator = num - 1;
        int res;

        System.out.println("Fatorial de: " + num);
        System.out.print(num + "!" + " = " + num + " . ");

        do {
            res = num * fator;
            num = res;

            if (fator >= 2 ) {
                System.out.print(fator + " . ");
            } else {
                System.out.print("1 ");
            }

            fator--;
        } while (fator >= 1);

        System.out.print("= " +res);

    }
}
