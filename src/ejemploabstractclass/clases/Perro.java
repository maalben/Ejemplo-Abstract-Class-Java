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
public class Perro extends Animal {

    public Perro() {
        super();
        this.setNombre("Lasie");
    }
    
    @Override
    public void moverse() {
        System.out.println("El perro se está moviendo");
    }
    
    
    
}
