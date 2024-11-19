/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisi;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args) {
        perpustakaan perpustakaan = new perpustakaan();

        // Menambahkan buku langsung melalui Perpustakaan
        perpustakaan.tambahBuku("Struktur Data");
        perpustakaan.tambahBuku("Big Data");
        // Menampilkan informasi buku di perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
