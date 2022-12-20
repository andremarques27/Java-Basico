package aula13;

import java.util.Scanner;

public class VelocidadeDownload {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Digite a velocidade da sua internet: ");
        int velocidadeInternet = scan.nextInt();

        double tempoDownload = tamanhoArquivo / (velocidadeInternet / 8) / 60;
        System.out.println("O tempo necessario para o download sera de: " + tempoDownload + "s");
    }
}
