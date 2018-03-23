/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thr3ad1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
//Segunda forma de crear Threads: implementando la interface Runnable

public class PtobarThreads implements Runnable{
    public static void main(String[] args) {
        //1.- Creamos el thread
        TareaX t1=new TareaX();
        TareaX t2=new TareaX();
        Runnable r=new PtobarThreads();
        Thread t3=new Thread(r);
        
        //2..Inicializado 
        t1.setName("Floky");
        
        t1.start();
        t2.start();
        t3.start();
        
        
        //3.-En ejecucion lo da la JVM decide
        
        //4.- Pausa no la vamos a poner aqui es en cfaso de 
        // que haga algo que dure cierto tiempo
        
        //5.- Su muerte es cuando termina su proceso 
    }

    @Override
    public void run() {
        
        while (true){
        LocalTime tiempo= LocalTime.now();
        int hora =tiempo.getHour();
        int minuto=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("La hora es"+hora+":"+minuto+":"+segundo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PtobarThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
