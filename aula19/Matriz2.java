package aula19;

import java.util.Random;

public class Matriz2 {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numerosAle = new Random();

        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios.length; j++){
                numerosAleatorios[i][j] = numerosAle.nextInt(9);
                }
            }
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios.length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 9;
        int linha5 = 5;
        for (int i=0; i<numerosAleatorios[linha5].length; i++){
            if (numerosAleatorios[linha5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5){
                menorL5 = numerosAleatorios[linha5][i];
            }

        }
        System.out.println("Maior numero da linha 5: " + maiorL5);
        System.out.println("Menor numero da linha 5:" + menorL5);

        int maiorC7 = 0;
        int menorC7 = 9;
        int coluna7 = 7;
        for (int i=0; i<numerosAleatorios.length; i++){
            if (numerosAleatorios[i][coluna7] > maiorC7){
                maiorC7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menorC7){
                menorC7 = numerosAleatorios[i][coluna7];
            }
        }

        System.out.println("Maior numero da coluna 7: " + maiorC7);
        System.out.println("Menor numero da coluna 7: " + menorC7);
    }
}
