/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author T-102
 */
public class Alumno  {
    
    
     private long numeroCuenta;
    private String Nombre;
     private String APaterno;
     private String AMaterno;
    private String materia;
    private Examen examen ;

    public Alumno(long numeroCuenta, String Nombre, String APaterno, String AMaterno, String materia, Examen examen) {
        this.numeroCuenta = numeroCuenta;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.materia = materia;
        this.examen = examen;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    
}

