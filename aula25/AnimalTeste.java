package aula25;

public class AnimalTeste {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.setNome("Camelo");
        animal.setComprimento("150 cm");
        animal.setPatas(4);
        animal.setCor("Amarelo");
        animal.setAmbiente("Terra");
        animal.setVelocidade("2.0 m/s");

        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Urso-do-canadá");
        mamifero.setComprimento("180 cm");
        mamifero.setPatas(4);
        mamifero.setCor("Vermelho");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidade("0.5 m/s");
        mamifero.setAlimento("Mel");

        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento("300 cm");
        peixe.setPatas(0);
        peixe.setCor("Cinza");
        peixe.setAmbiente("Mar");
        peixe.setVelocidade("1.5 m/s");
        peixe.setCaracteristicas("Barbatanas e cauda");


        System.out.println("Zoo: ");
        System.out.println("----------------------");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Comprimento: " + animal.getComprimento());
        System.out.println("Patas: " + animal.getPatas());
        System.out.println("Cor: " + animal.getCor());
        System.out.println("Ambiente: " + animal.getAmbiente());
        System.out.println("Velocidade: " + animal.getVelocidade());
        System.out.println("----------------------");
        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Comprimento: " + peixe.getComprimento());
        System.out.println("Patas: " + peixe.getPatas());
        System.out.println("Cor: " + peixe.getCor());
        System.out.println("Ambiente: " + peixe.getAmbiente());
        System.out.println("Velocidade: " + peixe.getVelocidade());
        System.out.println("Caracteristicas: " + peixe.getCaracteristicas());
        System.out.println("----------------------");
        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Comprimento: " + mamifero.getComprimento());
        System.out.println("Patas: " + mamifero.getPatas());
        System.out.println("Cor: " + mamifero.getCor());
        System.out.println("Ambiente: " + mamifero.getAmbiente());
        System.out.println("Velocidade: " + mamifero.getVelocidade());
        System.out.println("Alimento: " + mamifero.getAlimento());
        System.out.println("----------------------");

    }
}
