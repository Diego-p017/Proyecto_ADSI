/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Diego Puentes Austiin Tellez 
 */
public class Paciente{
    
 private String id;
 private String nombres;
 private String apellidos;
 private String fechaNacimiento;
 private String genero;
 
    public Paciente (
        String id,
        String nombres,
        String apellidos,
        String fechaNacimiento,
        String genero
    ){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    } 

    /**
     * @return the identifiacion
     */
    public String getIdentifiacion() {
        return id;
    }

    /**
     * @param identifiacion the identifiacion to set
     */
    public void setIdentifiacion(String identifiacion) {
        this.id = identifiacion;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fechanacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechaNacimiento(String fechanacimiento) {
        this.fechaNacimiento = fechanacimiento;
    }
    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param apellidos the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
