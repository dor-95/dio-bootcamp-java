package main.java.map.desafio.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (dicionarioIsEmpty()) return;
        this.dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        if (dicionarioMap.isEmpty()) return;
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    private boolean dicionarioIsEmpty() {
        if (dicionarioMap.isEmpty()) {
            System.out.println("O dicionário está vazio.");
            return true;
        }
        return false;
    }
}

class DicionarioTest {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Experiência", "Conhecimento ou aprendizado obtido através da prática ou da vivência");
        dicionario.exibirPalavras();
        System.out.println("##########");
        dicionario.removerPalavra("Testando");
        dicionario.removerPalavra("Experiência");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Testando"));

        dicionario.adicionarPalavra("Experiência", "Conhecimento ou aprendizado obtido através da prática ou da vivência");
        System.out.println(dicionario.pesquisarPorPalavra("Experiência"));
    }
}
