package main.java.list.desafio.ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(listaNumeros);
        numerosOrdenados.sort(Collections.reverseOrder());
        return numerosOrdenados;
    }

    public void exibirNumeros() {
        System.out.println(this.listaNumeros);
    }
}

class OrdenacaoNumerosTest {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionaNumero(5);
        ordenacaoNumeros.adicionaNumero(2);
        ordenacaoNumeros.adicionaNumero(4);
        ordenacaoNumeros.adicionaNumero(9);
        ordenacaoNumeros.adicionaNumero(7);
        System.out.print("Ordem original: ");
        ordenacaoNumeros.exibirNumeros();
        System.out.println("Ordenação crescente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordenação decrescente: " + ordenacaoNumeros.ordenarDescendente());
    }
}
