/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Paciente {
    
 private String identifiacion;
 private String nombres;
 private String apellidos;
 private String fechaNacimiento;

    /**
     * @return the identifiacion
     */
    public String getIdentifiacion() {
        return identifiacion;
    }

    /**
     * @param identifiacion the identifiacion to set
     */
    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
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
}
