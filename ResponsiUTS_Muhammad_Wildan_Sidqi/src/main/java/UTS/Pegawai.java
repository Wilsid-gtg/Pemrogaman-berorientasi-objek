/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Inspiron
 */
public class Pegawai {
    private String nama;
    private int gaji;
    
    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
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
    public int GetGaji() {
        return gaji;
    }
    public void SetGaji(int gaji) {
        this.gaji = gaji;
    }
}

class pegawaitetap extends Pegawai {
    int tunjangan;
    
    public pegawaitetap(String nama, int gaji,int tunjangan) {
        super(nama,gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkaninfo(){
      System.out.println();
      System.out.println("Nama pegawai : "+GetNama());
      System.out.println("Gaji         : "+GetGaji());
      System.out.println("Tunjangan    : "+tunjangan);
    }
}

class pegawaikontrak extends Pegawai {
    int kontrak;
    
    public pegawaikontrak(String nama, int gaji,int kontrak) {
        super(nama,gaji);
        this.kontrak = kontrak;
    }
    
    @Override
    public void tampilkaninfo(){
      System.out.println();
      System.out.println("Nama pegawai : "+GetNama());
      System.out.println("Gaji         : "+GetGaji());
      System.out.println("Lama kontrak : "+kontrak+" bulan");
    }
}