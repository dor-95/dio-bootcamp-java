package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (agendaContatos.isEmpty()) return;

        agendaContatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Optional<Integer> pesquisarPorNome(String nome) {
        if (!agendaContatos.isEmpty() && agendaContatos.containsKey(nome)) {
            return Optional.of(agendaContatos.get(nome));
        }
        return Optional.empty();
    }
}

class AgendaContatosTest {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Naruto", 32222342);
        agendaContatos.adicionarContato("Naruto", 9999999);
        agendaContatos.adicionarContato("Kakashi", 33222334);

        agendaContatos.exibirContatos();

        Optional<Integer> telefone = agendaContatos.pesquisarPorNome("Test");
        telefone.ifPresent(System.out::println);

        agendaContatos.removerContato("Kakashi");
        agendaContatos.exibirContatos();
    }
}
