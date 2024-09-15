/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_4;

/**
 *
 * @author ASUS
 */
public class pekerja extends manusia {
    private int gaji;
    
    public pekerja(String nama, int usia, String pekerjaan, int gaji){
        super (nama,usia,pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji() {
        return this.gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void OverridemetodetoString(){
        System.out.println("usia    : "+ usia +" tahun");
        System.out.println("profesi : "+ pekerjaan);
        System.out.println("Gaji    : Rp."+ getGaji());
    }
}
