package factoryMethod;

import prototype.Clone;

public abstract class CriadorUnidade extends Clone {
    public abstract Unidade criarUnidade();

    public Unidade criarPeca(){
        Unidade unidade=criarUnidade();
        return unidade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //clonar peca
        return super.clone();
    }  
            
}
