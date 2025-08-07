package modelos;

import interfaces.CarroSedan;

// Sedan da Toyota
public class CorollaSedan implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Corolla Sedan - Toyota");
    }
}
