import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemMap);
    }

    public void encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
            System.out.println(linguagemMaisFrequente);
        }
}
