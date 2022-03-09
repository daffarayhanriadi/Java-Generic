package daffa.belajarjava.generic;

// Generic Class
// <T> -> Tanda bahwa ini Generic
// Untuk penamaan Generic tidak boleh ambigu (Seperti : <String>)
public class MyData <T>{

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}