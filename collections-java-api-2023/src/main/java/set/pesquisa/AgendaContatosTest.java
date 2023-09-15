package main.java.set.pesquisa;

public class AgendaContatosTest {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Rosa", 123456);
        agendaContatos.adicionarContato("Rosa", 0);
        agendaContatos.adicionarContato("Rosa D", 1111111);
        agendaContatos.adicionarContato("Rosa C", 654987);
        agendaContatos.adicionarContato("Hinata H", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Hinata"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Hinata H", 5555555));
    }
}
