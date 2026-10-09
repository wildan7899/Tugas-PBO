# Tugas Pemrograman Berbasis Objek (PBO) - Hierarki Kelas OOP

Repositori ini berisi implementasi tugas pemrograman berorientasi objek dalam bahasa Java, mencakup konsep enkapsulasi, pewarisan (inheritance), dan polimorfisme (method overriding).

## Struktur Kelas & Penerapan Pilar OOP

### 1. Encapsulation (Enkapsulasi)
Enkapsulasi diterapkan dengan menggunakan access modifier `private` pada variabel atribut di setiap kelas, sehingga data terlindungi dari akses langsung luar kelas. Akses dan modifikasi nilai dilakukan melalui method `getter` dan `setter`.

Contoh pada kelas `Bentuk`:
```java
public class Bentuk {
    private String warna;
    
    public Bentuk(String warna) {
        this.warna = warna;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    ...
}
```

### 2. Inheritance (Pewarisan)
Pewarisan menggunakan keyword `extends` untuk mewarisi properti dan method dari parent class ke child class:
- `BujurSangkar` mewarisi `Bentuk`
- `Lingkaran` mewarisi `Bentuk`
- `Silinder` mewarisi `Lingkaran` (multilevel inheritance)

Contoh pada kelas `Silinder`:
```java
public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }
    ...
}
```

### 3. Polymorphism (Polimorfisme & Method Overriding)
Polimorfisme diterapkan melalui *method overriding*, di mana child class menyediakan implementasi spesifik dari method `printInfo()` yang dideklarasikan di parent class.

Contoh pada kelas `BujurSangkar`:
```java
@Override
public void printInfo() {
    System.out.println("Bujursangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
}
```

---

## Screenshot Hasil Eksekusi Program

![Screenshot Output](link_gambar_disini)

---

## Cara Menjalankan Program

1. Kompilasi kode sumber:
   ```bash
   javac -d bin src/*.java
   ```
2. Jalankan program utama:
   ```bash
   java -cp bin Main
   ```
