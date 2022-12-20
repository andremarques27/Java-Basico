package aula26;

public class Cubo extends Figura3D implements DimensaoVolumetrica{
    @Override
    public double calcularVolume() {

        double volume = (4 * 3 * 7);
        return volume;
    }
}
