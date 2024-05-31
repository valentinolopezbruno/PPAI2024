/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class PantallaImportacionActualizacionesDAO {
    
    // Mostrar la bodega
    public String mostrarBodegaConActualizacionDisponible(Bodega Bodega){
        return Bodega.getDescripcion();
    }
    
    public String tomarSeleccionBodega(Bodega Bodega){
        return "Bodega Seleccionada";
    }
}
