package aula26;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
    @Override
    public double calcularArea() {

        double area = (9 * 4) / 2;
        return area;
    }
}
