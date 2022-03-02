package daffa.belajarjava.generic.Aplication;

import daffa.belajarjava.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        // Membuat Generic Object
        MyData<String> stringMyData = new MyData<String>("Daffa"); // Jika input Number, maka akan ERROR karena tipe data generic sebelumnya adalah String
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
