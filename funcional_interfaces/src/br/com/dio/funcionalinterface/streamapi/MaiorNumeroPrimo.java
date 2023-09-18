package br.com.dio.funcionalinterface.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaiorNumeroPrimo {

    //    Desafio 14 - Encontre o maior número primo da lista:
//    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().distinct()
                .filter(n -> {
                    if (n < 2) return false;
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) return false;
                    }
                    return true;
                }).max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
}
