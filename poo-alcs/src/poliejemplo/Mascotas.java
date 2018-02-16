/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

import java.util.*;
/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        Animal animales[]= new Animal [12];
        
        
        //Primero generamos a los gatos 
        animales[0]=new Gato();
        animales[1]=new Gato();
        animales[3]=new Gato();
        
        //sigiente los perros
         animales[3]=new Perro();
         animales[4]=new Perro();
         
         // siguen los pollotos
          animales[5]=new Pollo();
          animales[6]=new Pollo();
          animales[7]=new Pollo();
          animales[8]=new Pollo();
          animales[9]=new Pollo();
          
          animales[10]=new Raton();
          animales[11]=new Raton();
          
          
         
          
          // la magia de polimrfismo!!!
          ServicoAnimal s= new ServicoAnimal();
          
          for(Animal a :animales){
              s.servicioHacerRuido((ComportamientoAnimal) a);
            
          }
          
          //vamos a generar un ArrayList y vamps a poner alli alginos animalitos
           
          ArrayList<Animal> animalitos=new ArrayList<>();
          animalitos.add(new Pollo());
          animalitos.add(new Raton());
          animalitos.add(new Gato());
          animalitos.add(new Perro());
          
          for (Animal a:animalitos){
              s.servicioHacerRuido((ComportamientoAnimal)a);
          }
          
          animalitos.get(0).setEdad(1);
          System.out.println(animalitos.get(0).getEdad());
    }
    
    
}
