/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.alcs;

/**
 *
 * @author T-102
 */
public class Imc {
    //el siguiente tributo es de tipo composicion agregacion 
    Usuario u;
    
    public String calcular(){
    
        float imc=u.peso/(u.altura*u.altura);
        return "Tu resultado es "+imc;
    }
    
}
