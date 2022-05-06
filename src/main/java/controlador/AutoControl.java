/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Auto;
import modelo.Propietario;
import servicio.AutoServicio;
/**
 *
 * @author CESAR
 */
public class AutoControl {
    
    public AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(int y , String m, String mod, String c, int nuP, String nP){
        var propietario = new Propietario(nuP,nP);
        var auto = new Auto(y,m,mod,c,propietario);
        this.autoServicio.crear(auto);
        return auto;
    }
    
    public Auto eliminar(int y) {
        return this.autoServicio.eliminar(y);
    }
    
    public Auto modificar(int y, Auto a) {
        return this.autoServicio.modificar(y,a);
    }
    
    
    
    public List<Auto> listar()
    {
        return this.autoServicio.listar();
    }
    
    
}
