package aula17;

import java.util.Scanner;

public class GrillNotaMil {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double codico;
        double valorT = 0;
        int lanches;
        double pagar = 0;


        System.out.println("              CARDAPIO: ");
        System.out.println("Cachorro Quente     Codico:100     R$1,20");
        System.out.println("Bauru Simples       Codico:101     R$1,30");
        System.out.println("Bauru com Ovo       Codico:102     R$1,50");
        System.out.println("Hanburguer          Codico:103     R$1,20");
        System.out.println("Cheesburguer        Codico:104     R$1,30");
        System.out.println("Refrigerante        Codico:105     R$1,00");
        do {
            System.out.println("Digite o codico do pedido do cliente: ");
            codico = scan.nextDouble();

            if (codico == 100) {
                valorT += 1.2;
            }

            if (codico == 101) {
                valorT += 1.3;
            }

            if (codico == 102) {
                valorT += 1.5;
            }

            if (codico == 103) {
                valorT += 1.2;
            }

            if (codico == 104) {
                valorT += 1.3;
            }

            if (codico == 105) {
                valorT += 1.0;
            }

        } while (codico > 99);

        System.out.println("Quantos lanches? ");
        lanches = scan.nextInt();

        pagar = valorT * lanches;

        System.out.println("Valor " + valorT);
        System.out.println("Valor a pagar: " + pagar);

    }
}
