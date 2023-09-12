package main.java.list.desafio;

public class CarrinhoDeComprasTest {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Camiseta", 12.50, 3);
        carrinhoDeCompras.adicionarItem("Camiseta", 12.50, 3);
        carrinhoDeCompras.adicionarItem("Blusa", 5.0, 1);
        carrinhoDeCompras.adicionarItem("Calça", 10.0, 2);
        carrinhoDeCompras.exibirItens();

        System.out.println("----------------------------------------------------------------");
        carrinhoDeCompras.removerItem("Camiseta");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
