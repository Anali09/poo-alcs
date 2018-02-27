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
public class NumeroNegativoException extends Exception{
    
    public NumeroNegativoException(){
        super("No es posible dar valores negativos!");
    }
    
}
