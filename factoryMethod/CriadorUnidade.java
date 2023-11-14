package factoryMethod;

public abstract class CriadorUnidade {
    public abstract Unidade criarUnidade();

    public Unidade criarPeca(){
        Unidade unidade=criarUnidade();
        return unidade;
    }  
            
}
