/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CESAR
 */
public class Propietario {
    
    private int numeroID;
    private String nombre;

    public Propietario(int numeroID, String nombre) {
        this.numeroID = numeroID;
        this.nombre = nombre;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" + "numeroID=" + numeroID + ", nombre=" 
                + nombre + '}';
    }
    
    
    
}
