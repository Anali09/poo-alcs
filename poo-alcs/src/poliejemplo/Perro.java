/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

/**
 *
 * @author T-102
 */
public class Perro extends Animal implements ComportamientoAnimal{

    @Override
    public void hacerRuido() {
        System.out.println("gua-gua-gua");
    }
    
    
}
