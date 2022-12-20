package aula15;

import java.util.Objects;
import java.util.Scanner;

public class SuspeitoCrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? ");
        String resposta1 = scan.next();
        System.out.println("Esteve no local do crime? ");
        String resposta2 = scan.next();
        System.out.println("Mora perto da vitima? ");
        String resposta3 = scan.next();
        System.out.println("Devia para a vitima? ");
        String resposta4 = scan.next();
        System.out.println("ja trabalhou para a vitima? ");
        String resposta5 = scan.next();

        int suspeita = 0;

        if (Objects.equals(resposta1, "S")) {
            suspeita++;
        } 
        
        if (Objects.equals(resposta2, "S")) {
            suspeita++;
        }
        
        if (Objects.equals(resposta3, "S")) {
            suspeita++;
        }
        
        if (Objects.equals(resposta4, "S")) {
            suspeita++;
        }
        
        if (Objects.equals(resposta5, "S")) {
            suspeita++;
        }
        
        if (suspeita == 5) {
            System.out.println("Assassina!");
        } else if (suspeita >= 3) {
            System.out.println("Cumplice!");
        } else if (suspeita == 2) {
            System.out.println("Suspeita!");
        } else {
            System.out.println("Inocente!");
        }

    }
}