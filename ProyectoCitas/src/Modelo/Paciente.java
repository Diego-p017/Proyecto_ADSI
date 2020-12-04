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
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
