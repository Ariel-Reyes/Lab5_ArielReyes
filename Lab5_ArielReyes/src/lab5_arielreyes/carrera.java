/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_arielreyes;

/**
 *
 * @author Ariel
 */
public class carrera {
    String nombre; 
    String facultad; 
    float costo_mensual; 
    String jefe_carrera;

    public carrera(String nombre, String facultad, float costo_mensual, String jefe_carrera) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo_mensual = costo_mensual;
        this.jefe_carrera = jefe_carrera;
    }

    public carrera() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getCosto_mensual() {
        return costo_mensual;
    }

    public void setCosto_mensual(float costo_mensual) {
        this.costo_mensual = costo_mensual;
    }

    public String getJefe_carrera() {
        return jefe_carrera;
    }

    public void setJefe_carrera(String jefe_carrera) {
        this.jefe_carrera = jefe_carrera;
    }

    @Override
    public String toString() {
        return "carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", costo_mensual=" + costo_mensual + ", jefe_carrera=" + jefe_carrera + '}';
    }
    
    
}
