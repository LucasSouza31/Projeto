package factoryMethod;

public class FabricaTank extends CriadorUnidade{

    @Override
    public Unidade criarUnidade() {
        return new UnidadeTank();
    }
    
}
