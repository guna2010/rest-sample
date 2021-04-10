package com.example.converter;

import java.util.TreeMap;

public class Exam {
    // String char - frequency  Raavi
    public static void main(String arg[]) {
        char arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String s = "E Hello Guna!";
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            char a[] = {c};
            String n = new String(a);
            s = s.replaceAll(n, "");


        }
        System.out.println(" s=" + s.trim());
    }
}
