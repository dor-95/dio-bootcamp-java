package br.com.dio.funcionalinterface.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int soma = 0;
                for(int i = integer; integer > 0; integer --) {
                    soma += integer;
                }
                System.out.println(soma);
            }
        });
        System.out.println("-----------------------------");

        int resultado = numeros.stream().map(integer -> {
            int soma = 0;
            for (int i = integer; integer > 0; integer--) {
                soma += integer;
            }
            return soma;
        }).reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
