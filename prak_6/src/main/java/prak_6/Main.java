/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_6;

/**
 *
 * @author Inspiron
 */
public class Main {
    public static void main(String[] args) {
    hewan hewan = new kucing();
    hewan.bersuara(); // Output: Meow

    kucing kucing = new kucing();
    kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
    kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded

    anjing anjing = new anjing();
    anjing.bersuara(); // Output: Woof
    anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}