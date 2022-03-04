# Java-Generic
## Covariant
* `Covariant` artinya kita bisa melakukan subsitusi subtype (child) dengan supertype (parent).
* Caranya agar generic object kita menjadi `covariant` adalah dengan menggunakan kata kunci (`? extends ParentClass`).
* Artinya saat kita membuat object `Contoh<String>`, maka bisa disubtitusi menjadi `Contoh<?extends Object>`.
* `Covariant` adalah read-only, hanya dapat memanggil data,jadi kita tidak bisa mengubah data generic nya.