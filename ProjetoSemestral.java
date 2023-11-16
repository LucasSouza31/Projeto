import factoryMethod.CriadorUnidade;
import factoryMethod.Unidade;

public class ProjetoSemestral {
    public static void main(String[] args) {

        CriadorUnidade peca = new CriadorUnidade();

        peca.criarUnidade();

        Unidade cavalo= peca.criarUnidade();

        
        cavalo.movimento();
        cavalo.habilidade();
        cavalo.capturar();

    }
}
