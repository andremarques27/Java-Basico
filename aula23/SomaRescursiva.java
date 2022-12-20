package aula23;

public class SomaRescursiva {

    public static int soma(int n){
        if (n == 0)
        return 0;
        else return soma(n-1) + n;
    }

}
