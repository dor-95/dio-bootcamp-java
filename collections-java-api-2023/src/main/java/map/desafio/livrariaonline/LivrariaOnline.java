package main.java.map.desafio.livrariaonline;

import java.util.*;
import java.util.function.Predicate;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            String tituloSalvo = entry.getValue().getTitulo();
            if (tituloSalvo.equalsIgnoreCase(titulo)) {
                livroMap.remove(entry.getKey());
                return;
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        ArrayList<Map.Entry<String, Livro>> livrosOrdenarPorPreco = new ArrayList<>(livroMap.entrySet());
        livrosOrdenarPorPreco.sort(Comparator.comparingDouble(l -> l.getValue().getPreco()));
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        for (Livro livro : livroMap.values()) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosAutor.add(livro);
            }
        }
        return livrosAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        for (Livro livro : livroMap.values()) {
            double precoLivro = livro.getPreco();
            if (precoLivro > precoMaisCaro) {
                livroMaisCaro = livro;
                precoMaisCaro = precoLivro;
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;
        for (Livro livro : livroMap.values()) {
            double precoLivro = livro.getPreco();
            if (precoLivro < precoMaisBarato) {
                livroMaisBarato = livro;
                precoMaisBarato = precoLivro;
            }
        }
        return livroMaisBarato;
    }
}
