package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se é mae/pai de pet: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte filhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean pet = scan.hasNextBoolean();
        System.out.println("Voce digitou os seguintes valores: ");
        System.out.println("Seu primeiro nome: " + primeiroNome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Numero(s) de filho(s) :" + filhos);
        System.out.println("Sua altura: " + altura);
        System.out.println("Tem pet" + pet);

    }
}
