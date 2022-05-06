/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CESAR
 */
public class Auto {
    
    
    private int year;
    private String marca;
    private String modelo;
    private String color;
    private Propietario unPropietario;

    public Auto(int year, String marca, String modelo, String color) {
        this.year = year;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Auto(int year, String marca, String modelo, String color, Propietario unPropietario) {
        this.year = year;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.unPropietario = unPropietario;
    }
    
   
     public boolean esPaisOrigen(){
        var retorno=false;
        if(this.marca.equals("FORD")||
           this.marca.equals("KIA")||
           this.marca.equals("CHEBROLET")||
           this.marca.equals("TOYOTA"))
            retorno=true;
        return retorno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }

    @Override
    public String toString() {
        return "Auto{" + "year=" + year + ", marca=" + marca + ", modelo=" 
                + modelo + ", color=" + color + ", unPropietario=" 
                + unPropietario + '}';
    }

    
    
    
}
