/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hitung Elektronik =  new elektronik();
        System.out.println("pajak elektronik :" + Elektronik.hitungpajak(55.000));
        System.out.println();
        Hitung Makanan =  new makanan();
        System.out.println("pajak makanan :" + Makanan.hitungpajak(26.000));
    }
}
