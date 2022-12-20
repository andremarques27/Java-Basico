package aula17;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean valNum = false;
        int num;

        do {
            System.out.println("Digite de 1 a 10: ");
            num = scan.nextInt();
            if (num > 0 && num <= 10) {
                valNum = true;
                System.out.println("A tabuada do " + num + ": ");
                System.out.println(num + " * " + "1 = " + num);
                System.out.println(num + " * " + "2 = " + num * 2);
                System.out.println(num + " * " + "3 = " + num * 3);
                System.out.println(num + " * " + "4 = " + num * 4);
                System.out.println(num + " * " + "5 = " + num * 5);
                System.out.println(num + " * " + "6 = " + num * 6);
                System.out.println(num + " * " + "7 = " + num * 7);
                System.out.println(num + " * " + "8 = " + num * 8);
                System.out.println(num + " * " + "9 = " + num * 9);
                System.out.println(num + " * " + "10 = " + num * 10);
            }
        } while (!valNum);

    }
}
