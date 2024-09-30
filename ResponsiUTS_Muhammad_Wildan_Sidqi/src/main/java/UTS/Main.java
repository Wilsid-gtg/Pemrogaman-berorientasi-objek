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
        elektronik produk1 = new elektronik("Laptop",15000000,2);
        produk1.tampilkaninfo();
        
        pegawaitetap pegawai1 = new pegawaitetap("Wildan",1000000,500000);
        pegawai1.tampilkaninfo();
        
        makanan produk2 = new makanan("snack",15000,"2023-12-30");
        produk2.tampilkaninfo();
        
        pegawaikontrak pegawai2 = new pegawaikontrak("Wildan",3000000,12);
        pegawai2.tampilkaninfo();
    }
}
