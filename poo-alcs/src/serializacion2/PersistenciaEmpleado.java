/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
    ArrayList<Empleado>empleados;
     
    
    //Generamos el metodo para serializar a nuestro usuario
     public PersistenciaEmpleado(){
         empleados=new ArrayList<>();
         
     }
     
    public void guardad(Empleado e)throws Exception{
        //Para serializar el primer paso es generar el archivo fisico donde estara nuestro objeto Usuario
        File file=new File("empleados.yo");
        
    if(file.exists()){
        empleados=buscarTodos();
    } 
    
    //Despues lo abrimos para escribir sobre el
    try{
    FileOutputStream fos=new FileOutputStream(file);
    
    //Luego serializamos
    ObjectOutputStream oos=new  ObjectOutputStream(fos);
    
    //Guardamos nuestro usuario
    empleados.add(e);
    oos.writeObject(empleados);
    
    //Ponemos un mensajito 
        System.out.println("Objeto guardado con exito ");
}catch (Exception ex){
        System.out.println(ex.getMessage());
}   
    }
    
    public ArrayList<Empleado> buscarTodos(){
     
        File file = new File ("empleado.yo");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            empleados = (ArrayList<Empleado>) ois.readObject();
            
        } catch(Exception e){
        
    }
        return empleados;
    }
   
    
    
}
