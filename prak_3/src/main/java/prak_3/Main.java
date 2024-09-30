/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_3;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil ("Toyota","Avanza",2001,"pink");
        mobil1.showroom();
        mobil1.displayinfo();
        mobil1.startEngine();
        
        System.out.println();
        
        mobil mobil2 = new mobil ("Lamborgini","Gallardo",2000,"merah");
        mobil2.showroom();
        mobil2.displayinfo();
        mobil2.startEngine();
    }
}
