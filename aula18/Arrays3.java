package aula18;

public class Arrays3 {
    public static void main(String[] args) {

        int[] numb = new int[8];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;
        numb[5] = 6;
        numb[6] = 7;
        numb[7] = 8;

        int[] numb2 = numb;

        System.out.println("O primeiro número do vetor é: " + numb[0] + " Que é igual ao segundo: " + 2 * numb2[0]);
    }
}