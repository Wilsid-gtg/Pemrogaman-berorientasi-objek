/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args) {
        kucing kucing = new kucing();
        kucing.nama = "Budi";
        kucing.jenis = "jawa";
        kucing.habitat = "darat";
        kucing.suara = "mengeong";
        kucing.informasi();
        
        System.out.println();
        
        anjing anjing = new anjing();
        anjing.nama = "heri";
        anjing.jenis = "pitbul";
        anjing.habitat = "darat";
        anjing.suara = "menggonggong";
        anjing.informasi();
    }
}
