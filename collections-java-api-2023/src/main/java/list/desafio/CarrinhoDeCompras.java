package main.java.list.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItens = new ArrayList<>();
        itens.forEach(item -> {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerItens.add(item);
            }
        });
        itens.removeAll(removerItens);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total do carrinho: " + valorTotal);
    }

    public void exibirItens() {
        itens.forEach(System.out::println);
    }
}
