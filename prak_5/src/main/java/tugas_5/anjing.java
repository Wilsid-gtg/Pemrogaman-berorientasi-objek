/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author Inspiron
 */
public class anjing extends hewan_darat {
    String suara;
    
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("suara : "+suara);
    }
}
