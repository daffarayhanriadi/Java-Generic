package daffa.belajarjava.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

        // Tidak bisa karena generic type nya sudah Number -> Bounded Number
//        NumberData<String> stringNumberData = new NumberData<String>("Daffa"); // ERROR

    }

    public static class NumberData<T extends Number> {

        private T data; // Semua tipe data Number bisa diakses oleh tipedata ini

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

            this.data.doubleValue();
        }
    }
}
