package main.java.map.desafio.livrariaonline;

public class LIvrariaOnlineTest {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

//      Adicionando itens na livraria
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5);

//      Realizando pesquisa por nome do autor
        System.out.println("Livros da George Orwell: " + livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));
        System.out.println("####-------------------------------");

//      Obtendo livro mais caro do Conjunto
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("####-------------------------------");

//      Obtendo livro mais barato do Conjunto
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());
        System.out.println("####-------------------------------");

//      Obterndo conjunto ordenado por preço
        System.out.println("Lista de livros ordenado por Preço: ");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("####-------------------------------");

//      Removendo livro do conjunto
        System.out.println("Removendo livro do conjunto: ");
        livrariaOnline.removerLivro("Malorie");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("####-------------------------------");

    }
}
