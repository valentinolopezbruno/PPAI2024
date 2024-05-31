/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class Bodega {
    private int id;
    private String descripcion;
    private String historia;
    private String periodoActualizacion;

    public Bodega() {
    }

    public Bodega(int id, String descripcion, String historia, String periodoActualizacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.historia = historia;
        this.periodoActualizacion = periodoActualizacion;
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getPeriodoActualizacion() {
        return periodoActualizacion;
    }

    public void setPeriodoActualizacion(String periodoActualizacion) {
        this.periodoActualizacion = periodoActualizacion;
    }
}


