/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        kendaraan mobil = new mobil();
        kendaraan sepeda = new sepeda();
        kendaraan jet = new pesawat();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        jet.berjalan();
        jet.info();
    }
}
