package aula26;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    @Override
    public double calcularArea() {

        double area = Math.PI * Math.pow(5, 2);
        return area;
    }
}
