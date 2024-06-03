public class Main {
    public static void main(String[] args) {
        /* Operações básicas
        ConjuntoPalavreasUnicas palavras = new ConjuntoPalavreasUnicas();

        palavras.adicionarPalavra("hoje");
        palavras.adicionarPalavra("sol");
        palavras.exibirPalavrasUnicas();
        palavras.adicionarPalavra("hoje");
        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("sol");
        palavras.exibirPalavrasUnicas();
        palavras.verificarPalavra("hoje");*/

        /* Pesquisa
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Comer");
        lista.adicionarTarefa("dormir");
        lista.adicionarTarefa("Comer");
        lista.adicionarTarefa("brincar");
        lista.exibirTarefas();

        lista.removerTarefa("Comer");
        lista.exibirTarefas();

        lista.contarTarefas();
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());
        lista.marcarTarefaPendente("brincar");
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());
        lista.limparListaTarefa();
        lista.exibirTarefas(); */

        //Ordenação
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        gerenciarAlunos.adicionarAluno("Pedro", 12534L, 5.3);
        gerenciarAlunos.adicionarAluno("Camila", 12535L, 0);
        gerenciarAlunos.adicionarAluno("Ana", 12536L, 8.7);

        gerenciarAlunos.exibirAlunoPorNota();
        gerenciarAlunos.exibirAlunosPorNome();

        gerenciarAlunos.removerAluno(12534L);
        gerenciarAlunos.exibirAlunosPorNome();
    }
}