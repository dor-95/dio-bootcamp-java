package main.java.list.desafio.somanumeros;

public class SomarNumerosTest {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(5);
        soma.adicionarNumero(6);
        soma.adicionarNumero(8);
        soma.adicionarNumero(10);
        soma.adicionarNumero(6);
        soma.adicionarNumero(1);
        soma.adicionarNumero(3);
        System.out.println("Lista de números: " + soma.exibirNumeros());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
        System.out.println("Maior número: " + soma.encontraMaiorNumero());
        System.out.println("Soma dos números: " + soma.calcularSoma());
    }
}
