package Exercicios;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio2_2 {

    //2 - Implemente uma expressão lambda que verifique se um número é primo.



    @FunctionalInterface
    public interface VerificarPrimo {
        boolean isPrimo(int num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        VerificarPrimo verificasrPrimo = (a) ->
                a > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(a)).noneMatch(i -> a % i == 0);

        boolean resultado = verificasrPrimo.isPrimo(numero);

        System.out.println((resultado ? "é primo" : "não é primo"));

        scanner.close();

    }
}
