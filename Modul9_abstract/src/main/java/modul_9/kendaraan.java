/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_9;

/**
 *
 * @author ASUS
 */
abstract class kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("Ini kendaraan");
    }
}

class mobil extends kendaraan {
    @Override
    void berjalan() {
       System.out.println("Mobil berjalan dengan cepat"); 
    }
}

class sepeda extends kendaraan {
    @Override
    void berjalan(){
        System.out.println("Sepeda berjalan sangat pelan");
    }
}

class pesawat extends kendaraan {
    @Override
    void berjalan(){
        System.out.println("Pesawat sedang terbang");
    }
}
