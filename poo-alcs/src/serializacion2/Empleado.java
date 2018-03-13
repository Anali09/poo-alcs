/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;


public class Empleado {
     private String nombre;
     private String paterno;
     private String materno;
     private Float sueldoBase;
     private String departamento;
     
      @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", sueldoBase=" + sueldoBase + ", departamento=" + departamento + '}';
    }
     

    public Empleado(String nombre, String paterno, String materno, Float sueldoBase, String departamento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.departamento = departamento;
    }

    Public Empleado (){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
  
         
     }
     
    
