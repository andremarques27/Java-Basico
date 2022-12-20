package aula15;

import java.util.Objects;
import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tipo de carne ira comprar: file duplo(F), alcatra(A) ou picanha(P)? ");
        String tipoCarne = scan.next();
        System.out.println("Quantos Kg ira comprar? ");
        double kgCarne = scan.nextDouble();
        System.out.println("Ira usar nosso cartão(S/N)? ");
        String cartao = scan.next();

        if (Objects.equals(tipoCarne, "F") && kgCarne <= 5) {
            double precoTotalFile = kgCarne * 5.80;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalFile / 100 * 5;
                double precoFinalDesconto = precoTotalFile - precoDesconto;
                System.out.println("File Duplo");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalFile);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("File Duplo");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalFile);
            }
        } else if (Objects.equals(tipoCarne, "F")) {
            double precoTotalFile = kgCarne * 4.90;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalFile / 100 * 5;
                double precoFinalDesconto = precoTotalFile - precoDesconto;
                System.out.println("File Duplo");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalFile);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("File Duplo");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalFile);
            }
        } else if (Objects.equals(tipoCarne, "A") && kgCarne <= 5) {
            double precoTotalAlcatra = kgCarne * 6.80;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalAlcatra / 100 * 5;
                double precoFinalDesconto = precoTotalAlcatra - precoDesconto;
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalAlcatra);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalAlcatra);
            }
        } else if (Objects.equals(tipoCarne, "A")) {
            double precoTotalAlcatra = kgCarne * 5.90;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalAlcatra / 100 * 5;
                double precoFinalDesconto = precoTotalAlcatra - precoDesconto;
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalAlcatra);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalAlcatra);
            }
        }else if (Objects.equals(tipoCarne, "P") && kgCarne <= 5) {
            double precoTotalPicanha = kgCarne * 7.80;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalPicanha / 100 * 5;
                double precoFinalDesconto = precoTotalPicanha - precoDesconto;
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalPicanha);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalPicanha);
            }
        } else if (Objects.equals(tipoCarne, "P")) {
            double precoTotalPicanha = kgCarne * 6.90;
            if (Objects.equals(cartao, "S")) {
                double precoDesconto = precoTotalPicanha / 100 * 5;
                double precoFinalDesconto = precoTotalPicanha - precoDesconto;
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Preco original: " + precoTotalPicanha);
                System.out.println("Forma de pagamento: Cartao Tabajara");
                System.out.println("Preco do desconto: " + precoDesconto);
                System.out.println("Preco a pagar: " + precoFinalDesconto);
            } else {
                System.out.println("Alcatra");
                System.out.println("Quantidade Kg: " + kgCarne);
                System.out.println("Forma de pagamento: Outros Cartoes");
                System.out.println("Preco a pagar: " + precoTotalPicanha);
            }
        }

    }
}
