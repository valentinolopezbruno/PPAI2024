/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class Varietal {
    private int id;
    private String descripcion;
    private int porcentajeComposicion;

    public Varietal() {
    }

    public Varietal(int id, String descripcion, int porcentajeComposicion) {
        this.id = id;
        this.descripcion = descripcion;
        this.porcentajeComposicion = porcentajeComposicion;
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

    public int getPorcentajeComposicion() {
        return porcentajeComposicion;
    }

    public void setPorcentajeComposicion(int porcentajeComposicion) {
        this.porcentajeComposicion = porcentajeComposicion;
    }
    
    
    
}
