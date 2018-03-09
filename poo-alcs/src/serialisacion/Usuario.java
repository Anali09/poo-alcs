/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisacion;

import java.io.*;
public class Usuario {
    
//Sirve para comprimir o serializar objetos a partir de la clase
public class Usuario implements Serializable {
    int edad;
    String nombre;

    public Usuario(){
        
    }

    public Usuario(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
}