package modelos;

import interfaces.CarroSedan;

// Sedan da Ford
public class FiestaSedan implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Fiesta Sedan - Ford");
    }
}
