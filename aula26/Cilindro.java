package aula26;

public class Cilindro extends Figura3D implements DimensaoVolumetrica {
    @Override
    public double calcularVolume() {

        double volume = (Math.PI*(7*3)*5);
        return volume;
    }
}
