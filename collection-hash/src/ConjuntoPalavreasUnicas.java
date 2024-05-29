import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavreasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavreasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        for(String s : palavrasSet)
        if (s.equals(palavra)){
            System.out.println("A palavra " + palavra + " está no conjunto");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
}
