package aula17;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario: ");
        String usuario = scan.next();
        System.out.println("Digite sua senha: ");
        String senha = scan.next();

        while (usuario.equalsIgnoreCase(senha)) {
            System.out.println("Usuario e senha nao podem ser iguais.");
            System.out.println("Tente outro usuario e senha.");

            System.out.println("Digite seu nome de usuario: ");
            usuario = scan.next();
            System.out.println("Digite sua senha: ");
            senha = scan.next();
        }

        System.out.println("Conta criada com sucesso!");

    }
}
