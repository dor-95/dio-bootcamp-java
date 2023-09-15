package main.java.set.desafio.listatarefas;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
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

    private Set<Tarefa> obterTarefas(Predicate<Tarefa> predicate) {
        Set<Tarefa> tarefas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (predicate.test(tarefa)) {
                tarefas.add(tarefa);
            }
        }
        return tarefas;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (listNotContainsTarefa(descricao)) return;

        tarefaSet.forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        });
    }

    public void marcarTarefaPendente(String descricao) {
        if (listNotContainsTarefa(descricao)) return;

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
            System.out.println("O conjunto está vazio!");
            return true;
        }
        return false;
    }

    public boolean listNotContainsTarefa(String descricao) {
        if (!tarefaSet.contains(new Tarefa(descricao))) {
            System.out.println("Tarefa não encontrada no conjunto.");
            return true;
        }
        return false;
    }
}
