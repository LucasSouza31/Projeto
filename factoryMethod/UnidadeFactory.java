package factoryMethod;


public abstract class UnidadeFactory   {

    public abstract Unidade criarUnidade();

    // public Unidade criarPeca(){
    //     Unidade unidade=criarUnidade();
    //     unidade.movimento();
    //     unidade.habilidade();
    //     unidade.capturar();
    //     return unidade;
    // }

    void pecaCriada(){
        System.out.println("Unidade Criada");
    }
        
    

}
