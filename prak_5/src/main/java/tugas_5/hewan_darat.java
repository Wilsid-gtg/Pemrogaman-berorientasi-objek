/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author Inspiron
 */
public class hewan_darat extends hewan{
    String habitat;
    
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("habitat : "+habitat);
    }
}
