/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek produk
        Produk buku = new Buku("Buku Pemrograman", 200000);
        
        Produk elektronik = new Elektronik("Laptop", 3000000);
        
        Produk pakaian = new Pakaian("Baju", 450000);

        // Membuat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Menampilkan daftar produk dan total harga setelah diskon
        keranjang.tampilkanDaftarProduk();
    }
}
