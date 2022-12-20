package aula15;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salario atual: ");
        double salario = scan.nextDouble();

        if (salario <= 280) {
            double salarioAumento = salario / 100 * 20;
            double salarioNovo = salario + salarioAumento;
            System.out.println("Salario anterior: " + salario);
            System.out.println("O salario aumentou em 20%");
            System.out.println("Aumento em % do novo salario: " + salarioAumento);
            System.out.println("Novo salario: " + salarioNovo);
        } else if (salario <= 700) {
            double salarioAumento = salario / 100 * 15;
            double salarioNovo = salario + salarioAumento;
            System.out.println("Salario anterior: " + salario);
            System.out.println("O salario aumentou em 15%");
            System.out.println("Aumento em % do novo salario: " + salarioAumento);
            System.out.println("Novo salario: " + salarioNovo);
        } else if (salario <= 1500) {
            double salarioAumento = salario / 100 * 10;
            double salarioNovo = salario + salarioAumento;
            System.out.println("Salario anterior: " + salario);
            System.out.println("O salario aumentou em 10%");
            System.out.println("Aumento em % do novo salario: " + salarioAumento);
            System.out.println("Novo salario: " + salarioNovo);
        } else {
            double salarioAumento = salario / 100 * 5;
            double salarioNovo = salario + salarioAumento;
            System.out.println("Salario anterior: " + salario);
            System.out.println("O salario aumentou em 5%");
            System.out.println("Aumento em % do novo salario: " + salarioAumento);
            System.out.println("Novo salario: " + salarioNovo);
        }

    }
}
