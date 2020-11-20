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
public class clases {
    String nombre; 
    int seccion;
    String edificio;
    String salon; 
    String aire_codicionado; 

    public clases(String nombre, int seccion, String edificio, String salon, String aire_codicionado) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire_codicionado = aire_codicionado;
    }

    public clases() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getAire_codicionado() {
        return aire_codicionado;
    }

    public void setAire_codicionado(String aire_codicionado) {
        this.aire_codicionado = aire_codicionado;
    }

    @Override
    public String toString() {
        return "clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", edificio=" + edificio + ", salon=" + salon + ", aire_codicionado=" + aire_codicionado + '}';
    }

}
