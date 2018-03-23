/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thr3ad1;

/**
 *
 * @author T-102
 */
//primera forma de crear un thread
//Heredando la clase 

public class TareaX extends Thread{

    @Override
    public void run() {
        
        System.out.println("Soy un thread muy srncillito "
                + "y me llamo"+Thread.currentThread().getName());
       
    }
   
    
}
