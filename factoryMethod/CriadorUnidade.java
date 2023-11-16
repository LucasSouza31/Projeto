package factoryMethod;


public class CriadorUnidade extends UnidadeFactory {

    @Override
    public Unidade criarUnidade() {
        return new UnidadeTabuleiro();

    }

}
