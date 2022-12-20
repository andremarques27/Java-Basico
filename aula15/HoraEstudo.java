package aula15;

import java.util.Objects;
import java.util.Scanner;

public class HoraEstudo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Didite o turno que voce estuda (M/V/N): ");
        String horaEstudo = scan.nextLine();

        if (Objects.equals(horaEstudo, "M")) {
            System.out.println("Bom dia!");
        } else if (Objects.equals(horaEstudo, "V")) {
            System.out.println("Boa tarde!");
        } else if (Objects.equals(horaEstudo, "N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor invalido!");
        }

    }
}
