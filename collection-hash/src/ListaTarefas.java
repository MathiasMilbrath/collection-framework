import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    public Set<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa remover = null;
        for (Tarefa t : listaTarefa){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                remover = t;
                break;
            }
        }
        listaTarefa.remove(remover);
    }

    public void exibirTarefas(){
        System.out.println(listaTarefa);
    }

    public void contarTarefas(){
        int cont = 0;
        for (Tarefa t : listaTarefa){
            cont++;
        }
        System.out.println("Número de tarefas " + cont);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluida = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if (t.isCheck() == true){
                concluida.add(t);
            }
        }
        return concluida;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if (t.isCheck() == false){
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaPendente(String descrição){
        for (Tarefa t : listaTarefa){
            if (t.getDescricao().equalsIgnoreCase(descrição)){
                t.setCheck(true);
            }
        }
    }

    public void limparListaTarefa(){
        listaTarefa.clear();
    }


}
