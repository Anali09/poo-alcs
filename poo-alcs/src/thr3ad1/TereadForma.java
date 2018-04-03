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
public class TereadForma {
       public static void main(String[] args) {
        
        Thread t1=new Thread (new Runnable(){
            public void run(){
            System.out.println ("Yo soy un thread bueno");
                
            }//Se cierra el metodo run
            
        
    }
        );
        
        //Aqui ya andamos eb¿n el main 
        t1.start();
    
}
} 

