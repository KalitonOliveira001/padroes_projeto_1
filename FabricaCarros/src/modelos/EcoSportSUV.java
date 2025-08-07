package modelos;

import interfaces.CarroSUV;

// SUV da Ford
public class EcoSportSUV implements CarroSUV {
    @Override
    public void exibirInfoSUV() {
        System.out.println("EcoSport SUV - Ford");
    }
}
