import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    public Set<Aluno> alunoSet;

    public GerenciarAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, media, matricula));
    }

    public void removerAluno( long matricula){
        Aluno remover = null;
        for (Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
              remover = a;
              break;
          }
      }
        alunoSet.remove(remover);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> nome = new TreeSet<>(alunoSet);
        System.out.println(nome);
    }

    public void exibirAlunoPorNota(){
        Set<Aluno> nota = new TreeSet<>(new ComparatorNota());
        nota.addAll(alunoSet);
        System.out.println(nota);
    }

}
