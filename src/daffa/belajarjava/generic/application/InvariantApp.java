package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
//        doIt(stringMyData); // ERROR
//        MyData<Object> objectMyData = stringMyData; // ERROR
        MyData<Object> objectMyData = new MyData<>(1000); // ini tidak error karena ketika kita memasukkan 1000 -> ini sudah termasuk object juga
//        MyData<Integer> integerMyData = objectMyData; // ERROR
//        doItInteger(objectMyData); // ERROR

    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
