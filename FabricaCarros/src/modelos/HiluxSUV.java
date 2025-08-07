package modelos;

import interfaces.CarroSUV;

// SUV da Toyota
public class HiluxSUV implements CarroSUV {
    @Override
    public void exibirInfoSUV() {
        System.out.println("Hilux SUV - Toyota");
    }
}
