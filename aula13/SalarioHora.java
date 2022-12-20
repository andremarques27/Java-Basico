package aula13;

import java.util.Scanner;

public class SalarioHora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora? ");
        float salarioHora = scan.nextFloat();
        System.out.println("Quantas horas voce trabalhou no mes? ");
        float horasTrabalho = scan.nextFloat();

        float salarioTotal = salarioHora * horasTrabalho;
        float impRenda = salarioTotal / 100 * 11;
        float inss = salarioTotal / 100 * 8;
        float sindicato = salarioTotal / 100 * 5;
        float salarioLiquido = salarioTotal - impRenda - inss - sindicato;
        System.out.println("Seu salario no mes: " + salarioTotal);
        System.out.println("Valor pago ao Imposto de Renda: " + impRenda);
        System.out.println("Valor pago ao INSS: " + inss);
        System.out.println("Valor pago ao Sindicato: " + sindicato);
        System.out.println("Salario liquido: " + salarioLiquido);

    }
}
