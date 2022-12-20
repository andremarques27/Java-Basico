package aula15;

import java.util.Objects;
import java.util.Scanner;

public class VogalConsoante {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.nextLine();

        if (Objects.equals(letra, "a") || Objects.equals(letra, "e") || Objects.equals(letra, "i") || Objects.equals(letra, "o") || Objects.equals(letra, "u")) {
            System.out.println("E uma vogal!");
        } else {
            System.out.println("E uma consoante!");
        }

    }
}
