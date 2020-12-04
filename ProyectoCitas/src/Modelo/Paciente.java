/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 * 
 * @author Diego Puentes Austiin Tellez 
 */
public class Paciente{
    
<<<<<<< HEAD
 private String PacIdentificacion;
 private String PacNombre;
 private String PacApellido;
 private String PacfechaNacimiento;
 private String PacSexo;
 
    public Paciente (
        String PacIdentificacion,
        String PacNombre,
        String PacApellido,
        String PacfechaNacimiento,
        String PacSexo
    ){
        this.PacIdentificacion = PacIdentificacion;
        this.PacNombre = PacNombre;
        this.PacApellido = PacApellido;
        this.PacfechaNacimiento = PacfechaNacimiento;
        this.PacSexo = PacSexo;
        
    } 

    

    /**
     * @return the identifiacion
     */
    public String getIdentificacion() {
        return PacIdentificacion;
    }

    /**
     * @param identifiacion the identifiacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.PacIdentificacion = identificacion;
=======
  private String identificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;

    public Paciente(String id, String nom,String ape, String fec, String gen){
     identificacion=id;
     nombres=nom;
     apellidos=ape;
     fechaNacimiento=fec;
     genero=gen;
    }

    public Paciente() {
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
>>>>>>> 8043944ea44e6caa46aef11069552c2fc0e5946a
    }
    public String getNombres() {
        return PacNombre;
    }
<<<<<<< HEAD

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombre) {
        this.PacNombre = nombre;
=======
    public void setNombres(String nombres) {
        this.nombres = nombres;
>>>>>>> 8043944ea44e6caa46aef11069552c2fc0e5946a
    }
    public String getApellidos() {
        return PacApellido;
    }
<<<<<<< HEAD

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellido) {
        this.PacApellido = apellido;
=======
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
>>>>>>> 8043944ea44e6caa46aef11069552c2fc0e5946a
    }
    public String getFechaNacimiento() {
        return PacfechaNacimiento;
    }

<<<<<<< HEAD
    /**
     * @param fechaNacimiento the apellidos to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.PacfechaNacimiento = fechaNacimiento;
=======
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
>>>>>>> 8043944ea44e6caa46aef11069552c2fc0e5946a
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return PacSexo;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String sexo) {
        this.PacSexo = sexo;
    }
    
}
