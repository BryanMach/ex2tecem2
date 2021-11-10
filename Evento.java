/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

/**
 *
 * @author Windows 8.1
 */
public class Evento {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cupos
     */
    public int getCupos() {
        return cupos;
    }

    /**
     * @param cupos the cupos to set
     */
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the expositor
     */
    public String getExpositor() {
        return expositor;
    }

    /**
     * @param expositor the expositor to set
     */
    public void setExpositor(String expositor) {
        this.expositor = expositor;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the horas
     */
    public String getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(String horas) {
        this.horas = horas;
    }
    private int id;
    private int cupos;
    private String titulo;
    private String expositor;
    private String fecha;
    private String horas;
}
