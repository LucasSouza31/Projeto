package builder;

import java.util.ArrayList;
import java.util.List;

import factoryMethod.Unidade;

public class ProdutoTabuleiro {
    private List<String> components;

    private List<Unidade> pecas; // Adicionando pecas a partir do método fábrica


    public void addPecas(Unidade peca){
        pecas.add(peca);
    }


    public ProdutoTabuleiro() {
        components= new ArrayList<>();
    }

    public void addComponent(String component){
        components.add(component);
    }

}
