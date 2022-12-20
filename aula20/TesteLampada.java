package aula20;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada smart = new Lampada();
        smart.marca = "Positivo";
        smart.modelo = "Led";
        smart.potencia = Integer.parseInt("9");

        System.out.println(smart.marca);
        System.out.println(smart.modelo);
        System.out.println(smart.potencia + "W");
    }
}

