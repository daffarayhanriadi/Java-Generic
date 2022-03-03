# Java-Generic
## Invariant
* Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant.
* Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent).
* Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>, begitupun sebaliknya, saat membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>.