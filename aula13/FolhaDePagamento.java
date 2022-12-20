package aula13;

import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto ganha por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Digite suas horas trabalhadas no mes: ");
        double horasTrabalho = scan.nextDouble();
        double salarioBruto = salarioHora * horasTrabalho;

        if (salarioBruto <= 900) {
            double descontoINSS = salarioBruto / 100 * 10;
            double depositoFGTS = salarioBruto / 100 * 11;
            double descontoTotal = descontoINSS;
            double salarioLiquido = salarioBruto - descontoTotal;
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Isento do IR (ate $900)");
            System.out.println("Desconto do INSS: " + descontoINSS);
            System.out.println("Deposito FGTS: " + depositoFGTS);
            System.out.println("Total descontos: " + descontoTotal);
            System.out.println("Salario liquido: " + salarioLiquido);
        } else if (salarioBruto <= 1500) {
            double descontoIR = salarioBruto / 100 * 5;
            double descontoINSS = salarioBruto / 100 * 10;
            double depositoFGTS = salarioBruto / 100 * 11;
            double descontoTotal = descontoINSS + descontoIR;
            double salarioLiquido = salarioBruto - descontoTotal;
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Desconto IR (5%): " + descontoIR);
            System.out.println("Desconto do INSS: " + descontoINSS);
            System.out.println("Deposito FGTS: " + depositoFGTS);
            System.out.println("Total descontos: " + descontoTotal);
            System.out.println("Salario liquido: " + salarioLiquido);
        } else if (salarioBruto <= 2500) {
            double descontoIR = salarioBruto / 100 * 10;
            double descontoINSS = salarioBruto / 100 * 10;
            double depositoFGTS = salarioBruto / 100 * 11;
            double descontoTotal = descontoINSS + descontoIR;
            double salarioLiquido = salarioBruto - descontoTotal;
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Desconto IR (10%): " + descontoIR);
            System.out.println("Desconto do INSS: " + descontoINSS);
            System.out.println("Deposito FGTS: " + depositoFGTS);
            System.out.println("Total descontos: " + descontoTotal);
            System.out.println("Salario liquido: " + salarioLiquido);
        } else {
            double descontoIR = salarioBruto / 100 * 20;
            double descontoINSS = salarioBruto / 100 * 10;
            double depositoFGTS = salarioBruto / 100 * 11;
            double descontoTotal = descontoINSS + descontoIR;
            double salarioLiquido = salarioBruto - descontoTotal;
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Desconto IR (20%): " + descontoIR);
            System.out.println("Desconto do INSS: " + descontoINSS);
            System.out.println("Deposito FGTS: " + depositoFGTS);
            System.out.println("Total descontos: " + descontoTotal);
            System.out.println("Salario liquido: " + salarioLiquido);
        }

    }
}
