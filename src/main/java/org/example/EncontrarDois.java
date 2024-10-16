package org.example;

import java.util.ArrayList;
import java.util.List;

public class EncontrarDois {

    List<Integer> lista = new ArrayList<>();

    public int numerodedois(List<Integer> lista) {
        int count = 0;

        for (Integer num : lista) {
            if (num == 2) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        EncontrarDois encontrarDois = new EncontrarDois();

        encontrarDois.lista.add(1);
        encontrarDois.lista.add(2);
        encontrarDois.lista.add(3);
        encontrarDois.lista.add(2);
        encontrarDois.lista.add(5);
        encontrarDois.lista.add(2);

        int resultado = encontrarDois.numerodedois(encontrarDois.lista);
        System.out.println("Quantidade de números 2: " + resultado);
    }
}
