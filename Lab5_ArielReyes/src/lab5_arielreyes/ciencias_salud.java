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
public class ciencias_salud extends carrera {

    String tipo;

    public ciencias_salud() {
    }

    public ciencias_salud(String tipo, String nombre, String facultad, float costo_mensual, String jefe_carrera) {
        super(nombre, facultad, costo_mensual, jefe_carrera);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  tipo  ;
    }

}
