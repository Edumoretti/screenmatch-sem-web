package Exercicios;

import java.util.Scanner;

public class Exercicio2_3 {

    //3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

    @FunctionalInterface
    public interface ConverteParaMaiusculas {
        String converte(String str);
    }

    public static void main(String[] args) {

        ConverteParaMaiusculas converteParaMaiusculas = (str) -> str.toUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra em maiuscula: ");
        String palavra = scanner.nextLine();

        System.out.println(converteParaMaiusculas.converte(palavra));

        scanner.close();
    }

}
