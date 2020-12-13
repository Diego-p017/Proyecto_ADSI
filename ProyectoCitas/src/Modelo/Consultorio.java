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
public class Consultorio {
    
    private String idConsultorio;
    private String nombreConsultorio;

    public Consultorio (
        String idConsultorio,
        String nombreConsultorio
    ){
        this.idConsultorio = idConsultorio;
        this.nombreConsultorio = nombreConsultorio;
    }
    /**
     * @return the MedIdentificacion
     */
    public String getIdConsultorio() {
        return idConsultorio;
    }

    /**
     * @param idConsultorio the MedIdentificacion to set
     */
    public void setIdConsultorio(String idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    /**
     * @return the NombreConsultorio
     */
    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    /**
     * @param NombreCOnsultorio the NombreConsultorio to set
     */
    public void setNombreConsultorio(String nombreConsultorio) {
        this.nombreConsultorio = nombreConsultorio;
    }

}
