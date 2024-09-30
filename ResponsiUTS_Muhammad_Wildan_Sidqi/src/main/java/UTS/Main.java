/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args){
        makanan produk1 = new makanan("snack",15000,"2023-12-30");
        produk1.tampilkaninfo();
        
        pegawaikontrak pegawai1 = new pegawaikontrak("Wildan",3000000,12);
        pegawai1.tampilkaninfo();
    }
}
