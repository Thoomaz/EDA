package org.example;

import java.util.ArrayList;
import java.util.List;

public class EncontrarDois(List<Integer> list){
    if (list.isEmpty()) {
            return 0;
    }
    else {
        if (list.get(0) == 2){
                list.remove(0);
                return 1 + EncontrarDois(list);
            }
            else{
                list.remove(0);
                return EncontrarDois(list);
            }
    }
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
