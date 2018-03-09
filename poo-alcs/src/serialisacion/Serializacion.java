/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisacion;

import java.io.*;
public class Serializacion {
    
      public static void main(String[] args) throws Exception {
        //Primero generamos un usuario
        Usuario u=new Usuario(20,"Pedro");
        
        //Generamos un modelo de la clase que serializa
        PersistenciaUsuario p=new PersistenciaUsuario();
        
        //Ajustamos su atributo usuario
        p.setU(u);
        
        //Ahora si comprimimos 
        p.guardad();
    }
}


