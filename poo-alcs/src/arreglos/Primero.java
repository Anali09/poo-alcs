/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-102
 */
public class Primero {
    public static void main(String[] args) {
        //Arreglos no mutables
        int x[]={5,-2,6};
        
        //Para obtener un elemento del arreglo utilizamos
        System.out.println(x[3]);
        
        //Todos los arreglos no mutables tiene una propiedad para saber su tamaño
        System.out.println(x.length);
        
        //vamos a iterar el arreglo con un ciclo for
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            
        }
        
        //lo mismo pero con el for mejorado
        for(int a:x){
            System.out.println(a);
        }
    }
}
