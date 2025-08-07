package fabricas;

import interfaces.*;
import modelos.*;

// Fábrica da Ford
public class FabricaFord implements FabricaDeCarro {
    @Override
    public CarroSedan criarSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroSUV criarSUV() {
        return new EcoSportSUV();
    }
}
