/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_3;

/**
 *
 * @author Inspiron
 */
public class mobil {
   String merk;
   String model;
   int tahun;
   String warna;
    
    public mobil(String merk,String model,int tahun,String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna() {
       return warna;
    }
    public void setWarna(String warna) {
       this.warna = warna;
    }
    void showroom() {
         System.out.println("Pembelian mobil");
    }
    void displayinfo() {
        System.out.println("Merk  :"+ getMerk());
        System.out.println("Model :"+ getModel());
        System.out.println("Tahun :"+ getTahun());
        System.out.println("Warna :"+ getWarna());
    }
    void startEngine() {
         System.out.println("mesin mobil " + getMerk()+ " menyala");
    }
}
