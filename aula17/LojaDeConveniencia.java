package aula17;

import java.util.Scanner;

public class LojaDeConveniencia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valor;
        double valorT = 0;

        do {
            System.out.println("Qual o valor da mercadoria? ");
            valor = scan.nextDouble();
            valorT += valor;
        } while (valor > 0);

        System.out.println("Valor total: R$" + valorT);
        System.out.println("Valor pago: ");
        double recebido = scan.nextDouble();
        double troco = recebido - valorT;
        System.out.println("Troco: R$" + troco);

    }
}
