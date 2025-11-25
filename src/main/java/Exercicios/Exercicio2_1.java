package Exercicios;

public class Exercicio2_1 {


    //       1 - Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser implementada dentro de uma interface
    //       funcional com o método multiplicacao(int a, int b).


    @FunctionalInterface
    public interface Operacao {
        int multiplicacao(int a, int b);  // Um método abstrato
    }

    public static void main(String[] args) {
        Operacao operacao = (a, b) -> a * b;
        System.out.println(operacao.multiplicacao(2, 3));

    }
}
