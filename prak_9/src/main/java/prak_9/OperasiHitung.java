/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_9;

/**
 *
 * @author ASUS
 */
public interface OperasiHitung {
    int hitung(int a, int b);
}

class penjumlahan implements OperasiHitung{
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}

class pengurangan implements OperasiHitung{
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}