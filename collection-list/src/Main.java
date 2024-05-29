public class Main {
    public static void main(String[] args) {
        /*Operações basicas da List
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cerveja", 3.45, 2);
        carrinhoDeCompras.adicionarItem("Carne", 10, 5);
        System.out.println("O valor é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Cerveja");
        carrinhoDeCompras.exibirItens();*/

        /*Pesquisa em List
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(-1);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(3);

        System.out.println("Os números são: " + numeros.exibirNumeros());
        System.out.println("O maior número é: " + numeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + numeros.encontrarMenorNumero());
        System.out.println("A soma é: " + numeros.calcularSoma());*/

        //Ordenação de List
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(-1);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(3);

        numeros.ordenarAscendente();
        numeros.ordenarDescendente();

    }
}