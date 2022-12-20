package aula17;

import java.util.Scanner;

public class TemperaturaSemana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura para os proximos 7 dias: ");
        double temperatura1 = scan.nextDouble();
        double temperatura2 = scan.nextDouble();
        double temperatura3 = scan.nextDouble();
        double temperatura4 = scan.nextDouble();
        double temperatura5 = scan.nextDouble();
        double temperatura6 = scan.nextDouble();
        double temperatura7 = scan.nextDouble();
        
        double maoirTemp;
        double menorTemp;
        double mediaTemp = (temperatura1 + temperatura2 + temperatura3 + temperatura4 + temperatura5 + temperatura6 + temperatura7) / 7;

        if (temperatura1 > temperatura2 && temperatura1 > temperatura3 && temperatura1 > temperatura4 && temperatura1 > temperatura5 && temperatura1 > temperatura6 && temperatura1 > temperatura7) {
            maoirTemp = temperatura1;
        } else if ((temperatura2 > temperatura1 && temperatura2 > temperatura3 && temperatura2 > temperatura4 && temperatura2 > temperatura5 && temperatura2 > temperatura6 && temperatura2 > temperatura7)) {
            maoirTemp = temperatura2;
        } else if ((temperatura3 > temperatura1 && temperatura3 > temperatura2 && temperatura3 > temperatura4 && temperatura3 > temperatura5 && temperatura3 > temperatura6 && temperatura3 > temperatura7)) {
            maoirTemp = temperatura3;
        } else if ((temperatura4 > temperatura1 && temperatura4 > temperatura2 && temperatura4 > temperatura3 && temperatura4 > temperatura5 && temperatura4 > temperatura6 && temperatura4 > temperatura7)) {
            maoirTemp = temperatura4;
        } else if ((temperatura5 > temperatura1 && temperatura5 > temperatura2 && temperatura5 > temperatura3 && temperatura5 > temperatura4 && temperatura5 > temperatura6 && temperatura5 > temperatura7)) {
            maoirTemp = temperatura5;
        } else if ((temperatura6 > temperatura1 && temperatura6 > temperatura2 && temperatura6 > temperatura3 && temperatura6 > temperatura4 && temperatura6 > temperatura5 && temperatura1 > temperatura7)) {
            maoirTemp = temperatura6;
        } else {
            maoirTemp = temperatura7;
        }

        if (temperatura1 < temperatura2 && temperatura1 < temperatura3 && temperatura1 < temperatura4 && temperatura1 < temperatura5 && temperatura1 < temperatura6 && temperatura1 < temperatura7) {
            menorTemp = temperatura1;
        } else if ((temperatura2 < temperatura1 && temperatura2 < temperatura3 && temperatura2 < temperatura4 && temperatura2 < temperatura5 && temperatura2 < temperatura6 && temperatura2 < temperatura7)) {
            menorTemp = temperatura2;
        } else if ((temperatura3 < temperatura1 && temperatura3 < temperatura2 && temperatura3 < temperatura4 && temperatura3 < temperatura5 && temperatura3 < temperatura6 && temperatura3 < temperatura7)) {
            menorTemp = temperatura3;
        } else if ((temperatura4 < temperatura1 && temperatura4 < temperatura2 && temperatura4 < temperatura3 && temperatura4 < temperatura5 && temperatura4 < temperatura6 && temperatura4 < temperatura7)) {
            menorTemp = temperatura4;
        } else if ((temperatura5 > temperatura1 && temperatura5 < temperatura2 && temperatura5 < temperatura3 && temperatura5 < temperatura4 && temperatura5 < temperatura6 && temperatura5 < temperatura7)) {
            menorTemp = temperatura5;
        } else if ((temperatura6 > temperatura1 && temperatura6 < temperatura2 && temperatura6 < temperatura3 && temperatura6 < temperatura4 && temperatura6 < temperatura5 && temperatura1 < temperatura7)) {
            menorTemp = temperatura6;
        } else {
            menorTemp = temperatura7;
        }

            System.out.println("Maior temperatura: " + maoirTemp);
            System.out.println("Menor temperatura: " + menorTemp);
            System.out.println("Media temperarura: " + mediaTemp);

    }
}
