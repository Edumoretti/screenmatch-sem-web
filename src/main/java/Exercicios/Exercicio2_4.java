package Exercicios;

import java.util.Scanner;

public class Exercicio2_4 {

    //4 - Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão deve ser implementada
    // dentro de uma interface funcional com o método boolean verificarPalindromo(String str). Dica: utilize o método
    //  reverse da classe StringBuilder.

    @FunctionalInterface
    public interface VerificarPalindromo {
        boolean isPalindromo(String str);
    }

    public static void main(String[] args) {

        VerificarPalindromo verificarPalindromo = (str) -> str.equals(new StringBuilder(str).reverse().toString());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();



        System.out.println(verificarPalindromo.isPalindromo(palavra));

    }


}
