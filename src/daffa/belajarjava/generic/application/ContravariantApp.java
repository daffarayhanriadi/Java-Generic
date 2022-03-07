package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Daffa");
        // set data Integer
        objectMyData.setData(1000); // -> valid, karena MyData itu generic type nya itu adalah Object, jadi jika di set String atau juga Integer itu valid, dan jika diperhatikan tidak ada kode yang ERROR tetapi jika dijalankan akan ERROR
        // ERROR nya adalah kita mencoba merubah value Integer menjadi String
        MyData<? super String> myData = objectMyData;

        process(objectMyData);


        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        // Bahaya
//        String value = (String) myData.getData(); // -> Disini mencoba merubah Integer menjadi String
        Object value = myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("Daffa Rayhan");
    }
}
