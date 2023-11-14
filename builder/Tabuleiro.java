package builder;

import factoryMethod.Unidade;

public class Tabuleiro implements BuilderTabuleiro {

    private String nomeJogo;
    private ProdutoTabuleiro produto;
   

    public Tabuleiro(String nomeJogo) {
        this.nomeJogo = nomeJogo;
        produto= new ProdutoTabuleiro();
    }

    @Override
    public void corTabuleiro() {
        // Adicionar cor do tabuleiro
    }

    @Override
    public void materialTabuleiro() {
        // material do tabuleiro
    }

    @Override
    public void caracteristicaPosicao() {
        // Ex: posição A1 e B1 compreende um lago
    }

    @Override
    public void addAltura() {
        // Dimensão do tabuleiro
    }

    @Override
    public void addLargura() {
        // Dimensão do tabuleiro
    }

    @Override
    public ProdutoTabuleiro getTabuleiro() {
        return produto;
    }

    @Override
    public void addUnidade(Unidade unidade) {
        // adicionar as peças ao tabuleiro
    }

    
}
