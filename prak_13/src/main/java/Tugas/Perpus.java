/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunterbit;
    
    public Buku(String judul, String pengarang, int tahunterbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }
    public String getJudul() {
    return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunterbit;
    }
    public void tampilkanInfo() {
    System.out.println("Judul: " + judul + ", Harga: " + pengarang + ", Tahun terbit: " + tahunterbit);
    }
}
public class Perpus {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah buku");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File(Serialisasi)");
            System.out.println("4. Tampilkan Semua buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            switch (pilihan) {
            case 1 -> tambahbuku(scanner);
            case 2 -> simpanKeFileTeks();
            case 3 -> simpanKeFileSerial();
            case 4 -> tampilkanbuku();
            case 5 -> {
                System.out.println("Keluar dari sistem.");
                scanner.close();
            return;
    }
    default -> System.out.println("Pilihan tidak valid.");
        }
     }
    }
private static void tambahbuku(Scanner scanner) {
    System.out.print("Masukkan judul: ");
    String judul = scanner.nextLine();
    System.out.print("Pengarang : ");
    String pengarang = scanner.nextLine();
    System.out.print("Tahun terbit: ");
    int tahunterbit = scanner.nextInt();
    bukuList.add(new Buku(judul, pengarang, tahunterbit));
    System.out.println("Buku berhasil ditambahkan.");
    }
 private static void simpanKeFileTeks() {
    try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
    for (Buku buku : bukuList) {
    writer.write(buku.getJudul() + "," + buku.getPengarang() + "," + buku.getTahunTerbit() + "\n");
    }
    System.out.println("Data produk berhasil disimpan ke file teks.");
    } catch (IOException e) {
    System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
        e.printStackTrace();
    }
 }
 private static void simpanKeFileSerial() {
    try (ObjectOutputStream oos = new
    ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
    oos.writeObject(bukuList);
    System.out.println("Objek produk berhasil disimpan ke file serial.");
    } catch (IOException e) {
    System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
        e.printStackTrace();
    }
 }
 private static void tampilkanbuku() {
 System.out.println("Daftar buku:");
    for (Buku  buku : bukuList) {
    buku.tampilkanInfo();
    }
    }
 }
