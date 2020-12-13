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
public class Medico {
    
    private String MedIdentificacion;
    private String MedNombre;
    private String MedApellido;
    
    public Medico (
        String MedIdentificacion,
        String MedNombre,
        String MedApellido
    ){
        this.MedIdentificacion = MedIdentificacion;
        this.MedNombre = MedNombre;
        this.MedApellido = MedApellido;
    }
    /**
     * @return the MedIdentificacion
     */
    public String getMedIdentificacion() {
        return MedIdentificacion;
    }

    /**
     * @param MedIdentificacion the MedIdentificacion to set
     */
    public void setMedIdentificacion(String MedIdentificacion) {
        this.MedIdentificacion = MedIdentificacion;
    }

    /**
     * @return the MedNombre
     */
    public String getMedNombre() {
        return MedNombre;
    }

    /**
     * @param MedNombre the MedNombre to set
     */
    public void setMedNombre(String MedNombre) {
        this.MedNombre = MedNombre;
    }

    /**
     * @return the MedApellido
     */
    public String getMedApellido() {
        return MedApellido;
    }

    /**
     * @param MedApellido the MedApellido to set
     */
    public void setMedApellido(String MedApellido) {
        this.MedApellido = MedApellido;
    }
}
