package main.java.set.desafio.listatarefas;

public class ListaTarefasTest {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");

        System.out.println("##------------------------------------------------");
        System.out.println("Exibindo todas as tarefas:");
        tarefas.exibirTarefas();
        System.out.println("Número de tarefas: " + tarefas.contarTarefas());
        System.out.println("##------------------------------------------------");

        tarefas.removerTarefa("Tarefa 3");

        System.out.println("##------------------------------------------------");
        System.out.println("Exibindo todas as tarefas:");
        tarefas.exibirTarefas();
        System.out.println("Número de tarefas: " + tarefas.contarTarefas());
        System.out.println("##------------------------------------------------");

        tarefas.adicionarTarefa("Tarefa 4");
        tarefas.adicionarTarefa("Tarefa 5");
        tarefas.adicionarTarefa("Tarefa 6");

        tarefas.marcarTarefaConcluida("Tarefa 2");
        tarefas.marcarTarefaConcluida("Tarefa 4");
        tarefas.marcarTarefaConcluida("Tarefa 6");

        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        System.out.println("##------------------------------------------------");
        tarefas.marcarTarefaPendente("Tarefa 6");
        tarefas.marcarTarefaPendente("Tarefa 7");
        tarefas.marcarTarefaConcluida("Tarefa 8");
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        System.out.println("##------------------------------------------------");
        System.out.println("Exibindo todas as tarefas:");
        tarefas.exibirTarefas();
        System.out.println("Número de tarefas: " + tarefas.contarTarefas());
        System.out.println("##------------------------------------------------");

        tarefas.limparListaTarefas();
        System.out.println("##------------------------------------------------");
        System.out.println("Exibindo todas as tarefas:");
        tarefas.exibirTarefas();
        System.out.println("Número de tarefas: " + tarefas.contarTarefas());
        System.out.println("##------------------------------------------------");



    }
}
