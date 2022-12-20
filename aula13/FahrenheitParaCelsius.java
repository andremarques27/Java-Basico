package aula13;

import java.util.Scanner;

public class FahrenheitParaCelsius {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fTemperatura = scan.nextFloat();

        double cTemperatura = (fTemperatura - 32) / 1.8;

        System.out.println("A temperatura convertida fica: " + cTemperatura);
    }
}
