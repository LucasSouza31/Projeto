package factoryMethod;

public class FabricaCamelot extends CriadorUnidade{

    @Override
    public Unidade criarUnidade() {
        return new UnidadeCamelot();
    }
    
}
