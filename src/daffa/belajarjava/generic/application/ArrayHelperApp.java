package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        // Menggunakan Generic Method
        String[] names = {"Daffa", "Rayhan", "Riadi"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(names));

        System.out.println(ArrayHelper.count(numbers));

    }
}
