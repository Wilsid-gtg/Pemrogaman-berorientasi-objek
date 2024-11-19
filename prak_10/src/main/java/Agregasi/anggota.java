/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregasi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Inspiron
 */
class anggota {
    private String nama;
    public anggota(String nama) {
    this.nama = nama;
    }
    
    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}
class klub {
    private String namaKlub;
    private List<anggota> anggotaList;
    public klub(String namaKlub) {
    this.namaKlub = namaKlub;
    this.anggotaList = new ArrayList<>();
    }
    public void tambahAnggota(String nama) {
        anggota anggota = new anggota(nama);
        anggotaList.add(anggota);
    }
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (anggota anggota : anggotaList) {
        anggota.infoAnggota();
    }
 }
}

