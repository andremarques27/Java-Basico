package aula22;

public class Contador {

    private static int cont;

    public static void increnmentar(){
        cont++;
    }

    public static void zerar(){
        cont = 0;
    }

    public static boolean obterCont(){
        System.out.println(cont);
        return false;
    }

}
