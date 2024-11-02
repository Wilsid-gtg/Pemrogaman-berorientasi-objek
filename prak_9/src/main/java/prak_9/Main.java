/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        OperasiHitung penjumlahan = new penjumlahan();
        System.out.println("Penjumlahan :" + penjumlahan.hitung(10, 5));
        System.out.println();
        OperasiHitung pengurangan = new pengurangan();
        System.out.println("Pengurangan :" + pengurangan.hitung(10, 5));
    }
}
