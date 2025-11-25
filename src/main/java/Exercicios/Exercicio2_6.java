package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio2_6 {


    //Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

    @FunctionalInterface
    public interface OrdenarLista {
        void ordenarLista(ArrayList<String> lista);
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequencia de palavras e \".\" ponto quando finalizar");

        String entrada = scanner.nextLine();
        while(entrada.isEmpty()  || !entrada.equals(".")){
            lista.add(entrada);
            entrada = scanner.nextLine();
        }

        OrdenarLista ordenar = l -> Collections.sort(l, (c1, c2) -> c1.compareToIgnoreCase(c2));
        ordenar.ordenarLista(lista);

        System.out.println("Lista ordenada:");
        System.out.println(lista);
    }

}
