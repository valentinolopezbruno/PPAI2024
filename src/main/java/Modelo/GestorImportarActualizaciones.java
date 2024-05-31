/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class GestorImportarActualizaciones {
    private int id;
    private String nombre;
    private String fechaActual;
    private Bodega Bodegas[];

    public GestorImportarActualizaciones() {
    }

    public GestorImportarActualizaciones(int id, String nombre, String fechaActual) {
        this.id = id;
        this.nombre = nombre;
        this.fechaActual = fechaActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    
}
