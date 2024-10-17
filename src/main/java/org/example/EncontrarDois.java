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
