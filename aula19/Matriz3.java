package aula19;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numerosRec = new int[3][3];

        for (int i=0; i<numerosRec.length; i++){
            for (int j=0; j<numerosRec[i].length; j++){

                System.out.println("Entre com o valor da posição [" + i + "," + j + "]");
                numerosRec[i][j] = scan.nextInt();
            }
        }

        int pares = 0;
        int impares = 0;
        for (int i=0; i<numerosRec.length; i++){
            for (int j=0; j<numerosRec[i].length; j++){

                if (numerosRec[i][j] % 2 == 0){
                    pares++;
                }else {
                    impares++;
                }
            }
        }

        for (int i=0; i<numerosRec.length; i++){
            for (int j=0; j<numerosRec.length; j++){
                System.out.print(numerosRec[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
