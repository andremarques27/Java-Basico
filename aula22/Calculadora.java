package aula22;

public class Calculadora {

    private static double calc;

    public static double somar(){
        calc = 15 + 16;
        return calc;
    }

    public static double subtrair(){
        calc = 15 - 16;
        return calc;
    }

    public static double multiplicar(){
        calc = 15 * 16;
        return calc;
    }

    public static double dividir(){
        calc = 250 / 16;
        return calc;
    }

    public static double potencia() {
        int a = 8, n = 6, res = 1;

        for (int i = n; i >= 1; i--) {
            res = res * a;
            calc = res;
        }
        return calc;
    }

}
