package builder;

import factoryMethod.Unidade;

public interface BuilderTabuleiro {
    void corTabuleiro();
    void materialTabuleiro();
    void caracteristicaPosicao(); // em uma dada posição colocar um atributo especifico - armadilha, agua
    void addAltura();
    void addLargura();
    void addUnidade(Unidade unidade);
    ProdutoTabuleiro getTabuleiro();
    
}
