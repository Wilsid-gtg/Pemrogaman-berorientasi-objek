/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Inspiron
 */
class Buku {
    private String judul;
    public Buku(String judul) {
    this.judul = judul;
    }
    public void infoBuku() {
     System.out.println("Judul Buku: " + judul);
    }
}

class perpustakaan {
    private List<Buku> bukuList;
    public perpustakaan(){
    this.bukuList = new ArrayList<>();
 }
    public void tambahBuku(String judul) {
        Buku buku = new Buku(judul);
        bukuList.add(buku);
 }
 public void infoPerpustakaan() {
    for (Buku buku : bukuList) {
    buku.infoBuku();
    }
  }
}
