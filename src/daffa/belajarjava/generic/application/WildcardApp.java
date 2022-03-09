package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<>(100));
        print(new MyData<>("Daffa"));
        print(new MyData<>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData) {
//        Object o = myData.getData(); // -> dibuat menjadi persamaan karena jika tidak maka kembalian nya akan '?'
//        String o = myData.getData(); // Bahaya
        System.out.println(myData.getData()); // jika ingin print doang, maka print saja.
    }
}
