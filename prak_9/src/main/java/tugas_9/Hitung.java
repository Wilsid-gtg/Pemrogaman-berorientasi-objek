/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_9;

/**
 *
 * @author ASUS
 */
public interface Hitung {
    double hitungpajak(double harga);
}

class elektronik implements Hitung {
    @Override
    public double hitungpajak(double harga) {
        return harga * 10/100 ;
    }
}

class makanan implements Hitung{
    @Override
    public double hitungpajak(double harga) {
        return harga * 5/100;
    }
}