package aula22;

public class ContadorTeste {

    static void imprimirValor(){
        System.out.println(Contador.obterCont());
    }

    public static void main(String[] args) {

        Contador.obterCont();

        Contador.increnmentar();

        Contador.obterCont();

        Contador.zerar();

        Contador.obterCont();

    }
}
