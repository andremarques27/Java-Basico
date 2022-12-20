package aula15;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
        } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
        } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);
        } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
        } else {
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
        }

    }
}
