/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

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
}catch (Exception e){
        System.out.println(e.getMessage());
}

    }    
    
    
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    public Usuario recobrarUsuario() {
        File file=new File("archivaldo.yo");
        Usuario recobrado=null;
        //El proceso inverso
        try{
        FileInputStream fis=new  FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        recobrado= (Usuario)ois.readObject();
    }catch (Exception e){
               
                }
        return recobrado;
    }   
    
    
    
    public ArrayList<Empleado>buscarTodos(){
        File file=new File("empleados.yo");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados= (ArrayList<Empleado>) ois.readObject();
        }catch(Exception e){;
        
            
        }
        return empleados;
    }
}
