package aula20;

import java.util.Objects;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fazer um depósito? S/N");
        String depopsito = scan.next();

        if (Objects.equals(depopsito, "N")){
            System.out.println("Número da conta: 4298 1176220-9");
            System.out.println("Saldo Bancario: R$:0");
            System.out.println("Conta Especial: Sim.");
            System.out.println("Limite Crédito: R$2.000,00");
        }else {
            System.out.println("Digite o valor do depósito: ");
            int deposito = scan.nextInt();

            System.out.println("Número da conta: 4298 1176220-9");
            System.out.println("Saldo Bancario: R$:" + deposito);
            System.out.println("Conta Especial: Não.");
            System.out.println("Limite Crédito: R$2.000,00");
        }
    }
}
