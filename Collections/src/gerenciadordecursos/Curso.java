package gerenciadordecursos;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aulas> aulas = new LinkedList<Aulas>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;

    }
    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aulas> getAulas(){
        return Collections.unmodifiableList(aulas);
    }
    @Override
    public String toString(){
        return "[Curso:" + this.nome + "," + "Instrutor:" + this.instrutor + " tempo total: " +this.getTempoTotal()+" minutos]";
    }

    public void adiciona(Aulas aula){
        this.aulas.add(aula);
    }
    public Set<Aluno> getAluno(){
        return Collections.unmodifiableSet(alunos);
    }

     public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

    }
    public boolean estamatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }
    public Aluno buscaaMatriculado(int numero){
        return matriculaParaAluno.get(numero);
        
       
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aulas aula : aulas) {
            tempoTotal += aula.getTempo();
        }

        return tempoTotal;
    }

}
