/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_arielreyes;

import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class Maestro {
    String nombre; 
    String apellido; 
    float salario; 
    int edad;
    ArrayList<clases> clase = new ArrayList(); 

    public Maestro() {
    }

    public Maestro(String nombre, String apellido, float salario, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<clases> getClase() {
        return clase;
    }

    public void setClase(ArrayList<clases> clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
