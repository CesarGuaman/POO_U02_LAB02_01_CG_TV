/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import java.util.List;
import modelo.Auto;
/**
 *
 * @author CESAR
 */
public interface IAutoServicio {
    
    public Auto crear(Auto a);
    public Auto modificar(int na, Auto a);
    public Auto eliminar(int a);
    public List<Auto> listar();
    public int buscarPosicion(int c);
    
}

