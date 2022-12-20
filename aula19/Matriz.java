package aula19;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numerosAle = new Random();

        int maiorNumero = 0;
        int linha = 0;
        int coluna = 0;

        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios.length; j++){
                numerosAleatorios[i][j] = numerosAle.nextInt(100);
                if (numerosAleatorios[i][j] > maiorNumero){
                    maiorNumero = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i=0; i<numerosAleatorios.length; i++){            for (int j=0; j<numerosAleatorios.length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
