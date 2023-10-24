package com.bnpp.epita.exception;

import java.util.List;

public class SimpleMaths {

    public static int calculateAverage (List<Integer> liste){
        int somme = 0;
        for (Integer element : liste) {
            somme += element;
        }
        int average = somme/ liste.size();
        return average;
    }
}
