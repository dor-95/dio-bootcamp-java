package main.java.set.desafio.listaalunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media) {
        alunoSet.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula) {
        alunoSet.removeIf(aluno -> aluno.getMatricula().compareTo(matricula) == 0);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(Comparator.comparingDouble(Aluno::getMedia));
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        alunoSet.forEach(System.out::println);
    }
}
