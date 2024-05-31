/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author valen
 */
import java.time.LocalDate;

public class GestorImportarActualizacionesDAO {
    
    // Obtener fecha actual
     public static void getFechaActual(String[] args, GestorImportarActualizaciones Gestor) {
        LocalDate fechaActual = LocalDate.now();
        String fechaActualStr = fechaActual.toString();
        System.out.println("Fecha de Hoy: " +  fechaActual);
        Gestor.setFechaActual(fechaActualStr);
    }
     
    // Obtener bodegas con actualizacionbes
        public void buscarBodegaConActualizacionDisponible() {
        // instancia a buscar los datos a la bodega
        BodegaDAO.tieneA
    }
    
    // Tomar la seleccion de la bodega
    public String tomarSeleccionBodega(Bodega Bodega){
        return "Bodega Seleccionada";
    }
     
    // Self que ordena actualizar los vinos de la respectiva bodega
    public void actualizarVinosBodega(){
        // dispara el metodo hacia la otra claase
    }
    
    // Self que ordena obtener los tipos de la uva 
    public void obtenerTiposUva(){
        // de aca se dispara la funcionalidad para obtenerlos segun del diagrama de secuencia
    }
     
}
