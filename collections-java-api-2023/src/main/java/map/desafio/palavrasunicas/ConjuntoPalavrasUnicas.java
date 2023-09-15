package main.java.map.desafio.palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }

    public void removePalavra(String palavra) {
        palavrasSet.removeIf(p -> p.equals(palavra));
    }

    public void verificarPalavra(String palavra) {
        if (this.palavrasSet.contains(palavra)) {
            System.out.println("A palavra " + palavra + " já foi adicionada.");
            return;
        }

        System.out.println("A palavra " + palavra + " não foi adicionada.");
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }
}

class ConjuntoPalavrasUnicasTest {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Amora");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Pera");
        conjuntoPalavrasUnicas.adicionarPalavra("Amora");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Amora");
        conjuntoPalavrasUnicas.verificarPalavra("Jabuticaba");

        conjuntoPalavrasUnicas.removePalavra("Pera");
        conjuntoPalavrasUnicas.removePalavra("Jabuticaba");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
