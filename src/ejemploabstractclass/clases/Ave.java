/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstractclass.clases;

/**
 *
 * @author usuario
 */
public class Ave extends Animal {

    public Ave() {
        super();
        setNombre("Piolin");
    }
    
    @Override
    public void moverse() {
        System.out.println("El ave está volando");
    }
    
}
