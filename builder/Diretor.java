package builder;

public class Diretor {
    BuilderTabuleiro builder;

    void construct(BuilderTabuleiro builder){
        this.builder= builder;
        builder.corTabuleiro();
        builder.materialTabuleiro();
        builder.addAltura();
        builder.addLargura();
        builder.getTabuleiro();
    }


}
