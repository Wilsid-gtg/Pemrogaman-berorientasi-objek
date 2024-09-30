/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Inspiron
 */
public class Produk {
    private String nama;
    private int harga;
    
    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public void tampilkaninfo(){
      System.out.println();
    }
    
    public String GetNama() {
        return nama;
    }
    
    public void SetNama(String nama) {
        this.nama = nama;
    }
    public int GetHarga() {
        return harga;
    }
    public void SetHarga(int harga) {
        this.harga = harga;
    }
}

class elektronik extends Produk {
    int garansi;
    
    public elektronik(String nama, int harga,int garansi) {
        super(nama,harga);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkaninfo(){
      System.out.println("Nama produk : "+GetNama());
      System.out.println("Harga       : "+GetHarga());
      System.out.println("Garansi     : "+garansi+" tahun");
    }
}

class makanan extends Produk {
    String expired;
    
    public makanan(String nama, int harga,String expired) {
        super(nama,harga);
        this.expired = expired;
    }
    
    @Override
    public void tampilkaninfo(){
      System.out.println();
      System.out.println("Nama produk : "+GetNama());
      System.out.println("Harga       : "+GetHarga());
      System.out.println("expired     : "+expired);
    }
}
