package br.com.dio.funcionalinterface.streamapi;

import java.util.Arrays;
import java.util.List;

//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class SomaTodosDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 28, 35, 180, 110, 200, 245);

        int resultado = numeros.stream().mapToInt(n -> {
            if (n / 10 == 0) return n;
            int sum = 0;
            int length = String.valueOf(n).length();
            for (int i = 0; i < length; i++) {
                sum += n % 10;
                n = n / 10;
            }
            return sum;
        }).sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + resultado);
    }
}
