package aula13;

import java.util.Scanner;

public class MetroParaCentimetro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        float metro = scan.nextFloat();

        float centimetro = metro * 100;
        System.out.println("O valor convertido para centimetros fica: " + centimetro);
    }
}
