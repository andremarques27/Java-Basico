package aula26;

public class Piramide extends Figura3D implements DimensaoVolumetrica {
    @Override
    public double calcularVolume() {

        float volume = (float)(0.83) * 4 * 3 * 8;
        return volume;
    }
}
