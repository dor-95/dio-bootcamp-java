package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {
    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (livroList.isEmpty()) throw new RuntimeException("A lista está vazia!");

        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (livroList.isEmpty()) throw new RuntimeException("A lista está vazia!");

        List<Livro> livrosPorInvervaloAnos = new ArrayList<>();
        for (Livro livro : livroList) {
            int anoPublicacao = livro.getAnoPublicacao();
            if (anoPublicacao >= anoInicial && anoPublicacao <= anoFinal) {
                livrosPorInvervaloAnos.add(livro);
            }
        }
        return livrosPorInvervaloAnos;
    }

    public Optional<Livro> pesquisarPorTitulo(String titulo) {
        if (livroList.isEmpty()) throw new RuntimeException("A lista está vazia!");

        for (Livro livro : livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }


}
