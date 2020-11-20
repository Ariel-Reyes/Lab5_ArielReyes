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
public class estudiantes {
    String nombre; 
    String apellido; 
    int num_cuenta; 
    int edad; 
    String sexo; 
    carrera carre; 

    public estudiantes() {
    }

    public estudiantes(String nombre, String apellido, int num_cuenta, int edad, String sexo, carrera carre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_cuenta = num_cuenta;
        this.edad = edad;
        this.sexo = sexo;
        this.carre = carre; 
    }

    public String getNombre() {
        return nombre;
    }

    public carrera getCarre() {
        return carre;
    }

    public void setCarre(carrera carre) {
        this.carre = carre;
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

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", num_cuenta=" + num_cuenta + ", edad=" + edad + ", sexo=" + sexo + ", carre=" + carre + '}';
    }

}
