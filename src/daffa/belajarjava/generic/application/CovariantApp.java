package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Daffa");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData; // membuat Covariant seperti ini juga boleh
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

//        myData.setData(1); // Tidak boleh, karena berbahaya
    }
}
