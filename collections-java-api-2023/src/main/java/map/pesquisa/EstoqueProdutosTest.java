package main.java.map.pesquisa;

public class EstoqueProdutosTest {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Adicionado produtos no estoque
        estoqueProdutos.adicionarProduto(1L, "Chimarrão", 10, 5.0);
        estoqueProdutos.adicionarProduto(7L, "Café", 6, 10.0);
        estoqueProdutos.adicionarProduto(2L, "Água", 2, 15.0);
        estoqueProdutos.adicionarProduto(10L, "Chá", 2, 20.0);

        // Exibindo produtos contidos no estoque
        System.out.println("Lista de produtos em estoque:");
        estoqueProdutos.exibirProdutos();
        System.out.println("------------------------------");

        // Calculando o total do estoque
        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        // Retorna o produto mais caro do estoque
        System.out.println("Produto mais caro do estoque: " + estoqueProdutos.obterProdutoMaisCaro());

        // Retorna o produto mais barato do estoque
        System.out.println("Produto mais barato do estoque: " + estoqueProdutos.obterProdutoMaisBarato());

        // Retorna o produto que está em maior quantidade no estoque,
        // considerando o valor total de cada produto (quantidade * preço).
        System.out.println("Produto está em maior quantidade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
