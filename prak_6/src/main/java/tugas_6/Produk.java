/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;


/**
 *
 * @author Inspiron
 */


// Kelas Produk
import java.util.ArrayList;
import java.util.List;

// Kelas Produk
class Produk {
    public String nama;  
    public int harga;    

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int hitungDiskon() {
        return harga;  
    }
}

class Buku extends Produk {
    public Buku(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public int hitungDiskon() {
        return harga - (harga * 25 / 100);
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public int hitungDiskon() {
        return harga - (harga * 20 / 100);
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public int hitungDiskon() {
        // Diskon 15% untuk Pakaian
        return harga - (harga * 15 / 100);
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    public List<Produk> daftarProduk;  

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    // Menambah produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    // Menghitung total harga setelah diskon dan menampilkan produk serta harga
    public void tampilkanDaftarProduk() {
        int totalHarga = 0;
        System.out.println("Daftar produk dalam keranjang:");
        for (Produk produk : daftarProduk) {
            int hargaDiskon = produk.hitungDiskon();
            System.out.println(produk.nama + " : Rp" + produk.harga);
            System.out.println("Harga diskon : Rp" + hargaDiskon);
            System.out.println();
            totalHarga += hargaDiskon;
        }
        System.out.println("Total harga setelah diskon: Rp" + totalHarga);
        System.out.println("Terima kasih");
    }
}




    
