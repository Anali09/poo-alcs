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
public class PooAlcs {

    //
    public static void main(String[] args) {
         //Todo code application logic here 
        System.out.println("Hola mundo");
        //Tenemos que generar antes los objetos de las clases anteriores
        Usuario x=new Usuario();
       x.altura=1.68f;
       x.peso=71f;
        Imc algo=new Imc();
        algo.u=x;
        //Calculamos el imc a travez de su objeto 
        System.out.println(algo.calcular());
        
                
    }
    
}
