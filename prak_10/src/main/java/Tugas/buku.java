/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Inspiron
 */
class buku {
    private String judul;
    private Pengarang pengarang; // Agregasi dengan Pengarang

    public buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang(); // Menggunakan objek pengarang untuk memanggil infoPengarang()
    }
}

class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

class perpustakaan {
    private List<buku> daftarBuku;

    public perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, Pengarang pengarang) {
        buku buku = new buku(judul, pengarang); // Buku dibuat di sini (Komposisi)
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}
