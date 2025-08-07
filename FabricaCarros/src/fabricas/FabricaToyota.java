package fabricas;

import interfaces.*;
import modelos.*;

// Fábrica da Toyota
public class FabricaToyota implements FabricaDeCarro {
    @Override
    public CarroSedan criarSedan() {
        return new CorollaSedan();
    }

    @Override
    public CarroSUV criarSUV() {
        return new HiluxSUV();
    }
}
