/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_12;
import java.io.*;
/**
 *
 * @author ASUS
 */ 
// Kelas yang dapat diserialisasi
class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";

        // Membuat objek Produk
        Produk produk = new Produk("Laptop", 1500000, 10);

        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
            e.printStackTrace();
        }

        // Membaca objek dari file (Deserialisasi)
        try (ObjectInputStream ois   = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializedProduk = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            deserializedProduk.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}

