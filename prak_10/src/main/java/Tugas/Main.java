/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Inspiron
 */
public class Main {
     public static void main(String[] args) {
        // Objek pengarang hidup secara independen
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Raditya Dika");

        // Objek perpustakaan
        perpustakaan perpustakaan = new perpustakaan();

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku("Bumi", pengarang1);
        perpustakaan.tambahBuku("marmut merah jambu", pengarang2);

        // Menampilkan informasi perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
