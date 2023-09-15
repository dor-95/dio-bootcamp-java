package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        for (Produto p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.calcularValorTotalProduto();
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                produtoMaisBarato = produto;
                menorPreco = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    /**
     * Retorna o produto que está em maior quantidade no estoque,
     * considerando o valor total de cada produto (quantidade * preço).
     * @return Produto
     */
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorEstoque = null;
        double maiorValorTotalEmEstoque = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            double valorProdutoEmEstoque = produto.calcularValorTotalProduto();
            if (valorProdutoEmEstoque > maiorValorTotalEmEstoque) {
                produtoMaiorValorEstoque = produto;
                maiorValorTotalEmEstoque = valorProdutoEmEstoque;
            }
        }
        return produtoMaiorValorEstoque;
    }
}
