package main.java.set.desafio.listaalunos;

public class GerenciadorAlunosTest {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(1234L, "Luffy", 6);
        gerenciadorAlunos.adicionarAluno(3456L, "Zoro", 7);
        gerenciadorAlunos.adicionarAluno(8765L, "Nami", 9);
        gerenciadorAlunos.adicionarAluno(6789L, "Robin", 8.9);
        gerenciadorAlunos.adicionarAluno(1234L, "Sanji", 7);
        gerenciadorAlunos.adicionarAluno(4321L, "Chopper", 10);
        gerenciadorAlunos.adicionarAluno(1234L, "Smoke", 8);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("####-----------------------");

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("####-----------------------");

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println("####-----------------------");

        gerenciadorAlunos.removerAluno(8765L);
        gerenciadorAlunos.exibirAlunos();
        System.out.println("####-----------------------");
    }
}
