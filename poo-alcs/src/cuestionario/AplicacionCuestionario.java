/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author T-102
 */
import java.util.*;
public class AplicacionCuestionario {
    
    public static void main(String[] args) {
        
        //generamos las opciones 
      Opcion op1=new Opcion("Grasa", false);
       Opcion op2=new Opcion("Contaminacion", false);
       Opcion op3=new Opcion("Sol", false);
       Opcion op4=new Opcion("Azucar", true);
      
       //Creamos la pregunta
       ArrayList<Opcion> opciones=new ArrayList<>();
       
       opciones.add(op1);
       opciones.add(op2);
       opciones.add(op3);
       opciones.add(op4);
       
       
       //Creamos la pregunta 
       Pregunta p1=new Pregunta();
       p1.setTitulo("Cual es el principal causante de cancer?");
       p1.setOpciones(opciones);
       
       
       //Generamos el modelo 
       ModeloCuestionario modelo=new ModeloCuestionario();
       modelo.agregarPregunta(p1);
       ArrayList<Pregunta> c= modelo.obtenerCuestionario();
       
       //Intermoslo
       for(Pregunta p: c){
           System.out.println(p.getTitulo());
           for(Opcion o: p.getOpciones()){
               System.out.println(o.getTitulo()+" " +o.isCorrecta());
           } 
       }
    }
    
}
