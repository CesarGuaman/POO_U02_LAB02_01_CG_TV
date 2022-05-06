/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;
import controlador.AutoControl;
import modelo.Auto;
import modelo.Propietario;
/**
 *
 * @author CESAR
 */
public interface AutoVista {
  
    
     public static void main(String [] args)
    {
        var autoControl = new AutoControl();
        autoControl.crear(2019, "FORD", "AVIAR", "BLANCO", 100, "Juan");
        autoControl.crear(2020, "KIA", "SPORT", "AZUL", 200, "Pedro");
        autoControl.crear(2021, "TOYOTA", "HILUK", "NEGRO", 300, "Tomas");
        autoControl.crear(2022, "CHEBROLET", "SAIL", "ROJO", 400, "Maria");
        
        System.out.println("Listado Inicial");
        
        for(Auto a: autoControl.listar())
            System.out.println(a.toString());
        
        autoControl.eliminar(2020);

        System.out.println("Listado Eliminando el anio 2020");
        
        for(Auto a: autoControl.listar())
            System.out.println(a.toString());

        System.out.println("Listado Modificando el código 2021");
        
        var nuevoPropietario = new Propietario(300, "Angel"); 
       
        var nuevoAuto = new Auto(2022,"Ambacar", " Zit", "Gris", nuevoPropietario);
        
        autoControl.modificar(20, nuevoAuto);
        
        for(Auto a: autoControl.listar())
            System.out.println(a.toString());
        
    }
    
}
