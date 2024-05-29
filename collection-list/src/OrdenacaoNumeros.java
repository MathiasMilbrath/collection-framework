import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numerosInteiros;

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public void ordenarAscendente(){
        List<Integer> ordenado = new ArrayList<>(this.numerosInteiros);
        if (!numerosInteiros.isEmpty()){
            Collections.sort(ordenado);
            System.out.println(ordenado);
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void ordenarDescendente(){
        List<Integer> ordenado = new ArrayList<>(this.numerosInteiros);
        if (!numerosInteiros.isEmpty()){
            ordenado.sort(Collections.reverseOrder());
            System.out.println(ordenado);
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }
}
