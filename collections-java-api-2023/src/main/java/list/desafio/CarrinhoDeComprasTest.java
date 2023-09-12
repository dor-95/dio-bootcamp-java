package main.java.list.desafio;

public class CarrinhoDeComprasTest {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Camiseta");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho de compras: " + carrinhoDeCompras.calcularValorTotal());
    }
}
