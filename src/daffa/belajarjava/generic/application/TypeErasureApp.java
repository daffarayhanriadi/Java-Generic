package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Daffa"); // -> jika seperti ini (info generic nya hilang) bisa berbahaya
//        MyData<String> myData = new MyData<String>("Daffa"); -> Jika dibuat menjadi seperti ini maka akan aman

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
//        integerMyData.setData(1000);

        Integer integer = integerMyData.getData();

    }


}
