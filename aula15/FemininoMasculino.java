package aula15;

import java.util.Objects;
import java.util.Scanner;

public class FemininoMasculino {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo (F/M)");
        String sexo = scan.nextLine();

        if (Objects.equals(sexo, "F")) {
            System.out.println("Feminino");
        } else if (Objects.equals(sexo, "M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo invalido!");
        }

    }
}
