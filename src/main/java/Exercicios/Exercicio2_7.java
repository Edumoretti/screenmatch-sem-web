package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_7 {

    //Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

    @FunctionalInterface
    public interface Divisao {
        double dividir(double a, double b) throws ArithmeticException;

    }

    public static void main(String[] args) {

        Divisao divisor = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero");
            return a / b;
        };

        try {
            System.out.println(divisor.dividir(10, 2)); // Esperado: 5
            System.out.println(divisor.dividir(10, 0)); // Esperado: Exceção
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


