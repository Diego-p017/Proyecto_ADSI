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
    
 private int id;
 private String nombres;
 private String apellidos;
 private String fechaNacimiento;
 private String genero;
 
    public Paciente (
        int id,
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
     * @return the identificacion
     */
    public int getIdentificacion() {
        return id;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentifiacion(int identificacion) {
        this.id = identificacion;
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
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
