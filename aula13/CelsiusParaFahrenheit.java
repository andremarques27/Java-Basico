package aula13;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double cTemperatura = scan.nextDouble();

        double fTemperatura = cTemperatura * 1.8 + 32;
        System.out.println("A temperatua convertida fica: " + fTemperatura);

    }
}
