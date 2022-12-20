package aula20;

public class LivroDeLivraria {

    public static void main(String[] args) {

        Livro novo = new Livro();
        novo.nome = "A Danca dos Dragões";
        novo.autor = "George R.R. Martin";
        novo.genero = "Fantasia épica";
        novo.lancamento = 2012;
        novo.editora = "Suma (Brasil)";

        System.out.println(novo.nome);
        System.out.println(novo.autor);
        System.out.println(novo.genero);
        System.out.println(novo.lancamento);
        System.out.println(novo.editora);
    }
}
