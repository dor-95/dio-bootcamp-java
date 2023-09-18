package br.com.dio.funcionalinterface.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Desafio 16 - Agrupe os números em pares e ímpares:
//        Utilize a Stream API para agrupar os números em duas listas separadas,
//        uma contendo os números pares e outra contendo os números ímpares da lista original,
//        e exiba os resultados no console.
public class AgrupeNumerosParesEImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosImparesList = new ArrayList<>();
        List<Integer> numerosParesList = new ArrayList<>();

        numeros.stream().distinct()
                .forEach(n -> {
                    if (n % 2 == 0) {
                        numerosParesList.add(n);
                        return;
                    }
                    numerosImparesList.add(n);
                });

        System.out.println("Números pares: " + numerosParesList);
        System.out.println("Números ímpares: " + numerosImparesList);
    }
}
