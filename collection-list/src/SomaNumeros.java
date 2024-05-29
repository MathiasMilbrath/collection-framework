import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer n : numerosInteiros){
           soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int test = Integer.MIN_VALUE;
        for(Integer n : numerosInteiros){
            if (test < n){
                test = n;
            }
        }
        return test;
    }

    public int encontrarMenorNumero(){
        int test = Integer.MAX_VALUE;
        for(Integer n : numerosInteiros){
            if (test > n){
                test = n;
            }
        }
        return test;
    }

    public List<Integer> exibirNumeros(){
        return numerosInteiros;
    }
}
