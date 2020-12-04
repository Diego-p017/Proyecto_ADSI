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
    private String PacFechaNacimiento;
    private String PacSexo;

    public Paciente(String PacIdentificacion, String PacNombre,String PacApellido, String PacFechaNacimiento, String PacSexo){
     this.PacIdentificacion = PacIdentificacion;
     this.PacNombre = PacNombre;
     this.PacApellido = PacApellido;
     this.PacFechaNacimiento = PacFechaNacimiento;
     this.PacSexo = PacSexo;
    }

    Paciente(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdentificacion() {
        return PacIdentificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.PacIdentificacion = identificacion;
    }
    
    
    public String getNombres() {
        return PacNombre;
    }
    public void setNombres(String nombres) {
        this.PacNombre = nombres;
    }
    
    
    public String getApellidos() {
        return PacApellido;
    }
    public void setApellidos(String apellidos) {
        this.PacApellido = apellidos;
    }
    
    
    public String getFechaNacimiento() {
        return PacFechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.PacFechaNacimiento = fechaNacimiento;
    }
    
   
    public String getGenero() {
        return PacSexo;
    }
    public void setGenero(String genero) {
        this.PacSexo = genero;
    }
    
}
