package daffa.belajarjava.generic.application;

import daffa.belajarjava.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<>(100));
        print(new MyData<>("Daffa"));
        print(new MyData<>(new MultipleConstraintApp().Manager));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
