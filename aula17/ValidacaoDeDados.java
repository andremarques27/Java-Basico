package aula17;

import java.util.Scanner;

public class ValidacaoDeDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        while (nome.length() < 3) {
            System.out.println("Nome minino caracteres 4");
            System.out.println("Digite seu nome: ");
            nome = scan.next();
        }

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida (maior que 0 e menor que 150");
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Digite seu salario: ");
        double salario = scan.nextDouble();

        while (salario < 0) {
            System.out.println("Salario nao pode ser menor que 0");
            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();
        }

        boolean sexoValido = false;
        String sexo;
        String sexoUsuario;

        do {
            System.out.println("Digite seu sexo: ");
            sexo = scan.next();

            switch (sexo) {
                case "f", "F", "m", "M" -> sexoValido = true;
            }
        } while (!sexoValido); {
            System.out.println("Sexo invalido");
            System.out.println("Digite seu sexo: ");
            sexo = scan.next();
        }

        if (sexo.equalsIgnoreCase("F")) {
            sexoUsuario = "Sexo feminino";
        } else {
            sexoUsuario = "Sexo masculino";
        }

        boolean estadoValido = false;
        String estadoCivil;
        String estadoUsuario = null;

        do {
            System.out.println("Digite seu estado civil: ");
            estadoCivil = scan.next();

            switch (estadoCivil) {
                case "s", "S", "c", "C","v", "V", "d", "D" -> estadoValido = true;
            }
        } while (!estadoValido); {
            System.out.println("Estado civil invalido");
            estadoCivil = scan.next();
        }

        switch (estadoCivil) {
            case "s", "S" -> estadoUsuario = "Solteiro";
            case "c", "C" -> estadoUsuario = "Casado";
            case "v", "V" -> estadoUsuario = "Viuvo";
            case "d", "D" -> estadoUsuario = "Divorciado";
        }

        System.out.println("Seu nome:" + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Seu salario: " + salario);
        System.out.println("Seu sexo: " + sexoUsuario);
        System.out.println("Seu estado civil: " + estadoUsuario);

    }
}