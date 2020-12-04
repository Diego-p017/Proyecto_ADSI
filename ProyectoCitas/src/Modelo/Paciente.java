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

    
    }
    public String getNombres() {
        return PacNombre;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombre) {
        this.PacNombre = nombre;

    }
    public String getApellidos() {
        return PacApellido;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellido) {
        this.PacApellido = apellido;

    }
    public String getFechaNacimiento() {
        return PacfechaNacimiento;
    }


    /**
     * @param fechaNacimiento the apellidos to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.PacfechaNacimiento = fechaNacimiento;

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
