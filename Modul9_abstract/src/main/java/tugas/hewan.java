/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
abstract class hewan {
    abstract void suara();
    
    void info() {
        System.out.println("Hewan bersuara");
    }
}

class kucing extends hewan {
    @Override
    void suara() {
        System.out.println("suara kucing :'Meong'");
    }
}

class anjing extends hewan {
    @Override
    void suara() {
        System.out.println("suara anjing :'Guk Guk'");
    }
}