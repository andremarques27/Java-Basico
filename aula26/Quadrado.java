package aula26;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
    @Override
    public double calcularArea() {

        double raio = Math.pow(5, 2) * 2;
        return raio;
    }
}
