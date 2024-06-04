import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            throw new RuntimeException("Dicionario está vazio");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public void pesquisarPorPalavra(String palavra){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario.get(palavra));
        }
    }
}
