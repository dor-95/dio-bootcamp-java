package main.java.map.ordenacao;

import java.util.Set;

public class CadastroProdutosTest {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Feijão", 10.90, 5);
        cadastroProdutos.adicionarProduto(2L, "Arroz", 5.0, 1);
        cadastroProdutos.adicionarProduto(3L, "Macarrão", 8.50, 6);
        cadastroProdutos.adicionarProduto(4L, "Banana", 2.80, 3);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
