package main.java.map.desafio.listatarefas;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        if (listIsEmpty()) return;

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(tarefa);
                return;
            }
        }
    }

    public void exibirTarefas() {
        if (listIsEmpty()) return;
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return obterTarefas(Tarefa::isConcluida);
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return obterTarefas(tarefa -> !tarefa.isConcluida());
    }

    public Set<Tarefa> obterTarefas(Predicate<Tarefa> predicate) {
        Set<Tarefa> tarefas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (predicate.test(tarefa)) {
                tarefas.add(tarefa);
            }
        }
        return tarefas;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (listIsEmpty()) return;

        tarefaSet.forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        });
    }

    public void marcarTarefaPendente(String descricao) {
        if (listIsEmpty()) return;

        tarefaSet.forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
            }
        });
    }

    public void limparListaTarefas() {
        if (listIsEmpty()) return;
        this.tarefaSet.clear();
    }

    public boolean listIsEmpty() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista está vazia!");
            return true;
        }
        return false;
    }
}
