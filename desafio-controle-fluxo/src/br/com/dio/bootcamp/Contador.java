package br.com.dio.bootcamp;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parameterOne = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parameterTwo = scanner.nextInt();

        try {
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void count(int parameterOne, int parameterTwo ) throws InvalidParametersException {
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int count = parameterTwo - parameterOne;

        for(int i = 0; i < count; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
