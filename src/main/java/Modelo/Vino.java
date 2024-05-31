/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class Vino {
    private int id;
    private String fechaActualizacion;
    private String imagenEtiqueta; // archivo .web de cloudinary
    private String nombre;
    private String notaDeCartaDeBodega;
    private int precioARS;

    public Vino() {
    }

    public Vino(int id, String fechaActualizacion, String imagenEtiqueta, String nombre, String notaDeCartaDeBodega, int precioARS) {
        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.imagenEtiqueta = imagenEtiqueta;
        this.nombre = nombre;
        this.notaDeCartaDeBodega = notaDeCartaDeBodega;
        this.precioARS = precioARS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getImagenEtiqueta() {
        return imagenEtiqueta;
    }

    public void setImagenEtiqueta(String imagenEtiqueta) {
        this.imagenEtiqueta = imagenEtiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotaDeCartaDeBodega() {
        return notaDeCartaDeBodega;
    }

    public void setNotaDeCartaDeBodega(String notaDeCartaDeBodega) {
        this.notaDeCartaDeBodega = notaDeCartaDeBodega;
    }

    public int getPrecioARS() {
        return precioARS;
    }

    public void setPrecioARS(int precioARS) {
        this.precioARS = precioARS;
    }
    
    
    
    
    
}
