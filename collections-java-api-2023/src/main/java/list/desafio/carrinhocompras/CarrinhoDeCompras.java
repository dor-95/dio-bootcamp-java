package main.java.list.desafio.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        if (listIsEmpty()) return;

        List<Item> removerItens = new ArrayList<>();
        itensList.forEach(item -> {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerItens.add(item);
            }
        });
        itensList.removeAll(removerItens);
    }

    public double calcularValorTotal() {

        if (itensList.isEmpty()) throw new RuntimeException("A lista está vazia!");

        double valorTotal = 0;
        for (Item item : itensList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (listIsEmpty()) return;

        System.out.println("#########CarrinhoDeCompras");
        itensList.forEach(System.out::println);
        System.out.println("#########-----------------");
    }

    private boolean listIsEmpty() {
        if (itensList.isEmpty()) {
            System.out.println("A lista está vazia!");
            return true;
        }
        return false;
    }
}
