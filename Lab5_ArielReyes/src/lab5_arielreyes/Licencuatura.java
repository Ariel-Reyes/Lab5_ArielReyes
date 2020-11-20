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
public class Licencuatura extends carrera {

    String tipo;

    public Licencuatura() {
    }

    public Licencuatura(String tipo, String nombre, String facultad, float costo_mensual, String jefe_carrera) {
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
        return "Licencuatura{" + "tipo=" + tipo + '}';
    }

}
