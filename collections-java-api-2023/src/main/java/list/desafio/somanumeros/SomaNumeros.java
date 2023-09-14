package main.java.list.desafio.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public int calcularSoma() {
        listIsEmpty();

        int soma = 0;
        for (int numero : integerList) {
            soma += numero;
        }
        return soma;
    }

    public int encontraMaiorNumero() {
        listIsEmpty();

        int maiorNumero = integerList.get(0);
        for (Integer numero : integerList) {
            maiorNumero = Integer.max(maiorNumero, numero);
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        listIsEmpty();

        int menorNumero = integerList.get(0);
        for (Integer numero : integerList) {
            menorNumero = Integer.min(menorNumero, numero);
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        listIsEmpty();
        return integerList;
    }

    public void listIsEmpty() {
        if (integerList.isEmpty()) throw new RuntimeException("A lista está vazia!");
    }
}
