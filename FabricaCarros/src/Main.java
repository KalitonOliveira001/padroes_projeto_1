import fabricas.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {

        // Usando a fábrica da Ford
        FabricaDeCarro fabricaFord = new FabricaFord();
        CarroSedan sedanFord = fabricaFord.criarSedan();
        CarroSUV suvFord = fabricaFord.criarSUV();

        sedanFord.exibirInfoSedan();
        suvFord.exibirInfoSUV();

        System.out.println("------------------------");

        // Usando a fábrica da Toyota
        FabricaDeCarro fabricaToyota = new FabricaToyota();
        CarroSedan sedanToyota = fabricaToyota.criarSedan();
        CarroSUV suvToyota = fabricaToyota.criarSUV();

        sedanToyota.exibirInfoSedan();
        suvToyota.exibirInfoSUV();
    }
}
