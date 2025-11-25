package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2_5 {


    //5 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista onde cada número foi multiplicado por 3.
    // Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros e . ponto quando finalizar");
        String entrada = scanner.nextLine();

        while(entrada != null && !entrada.equals(".")){
            lista.add(Integer.valueOf(entrada));
            entrada = scanner.nextLine();
        }

        lista.replaceAll((n) -> n * 3);

        System.out.println(lista);



    }


}
