/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import java.util.ArrayList;
import java.util.List;
import modelo.Auto;
/**
 *
 * @author CESAR
 */
public class AutoServicio implements IAutoServicio{
    
    public final List<Auto> autoList = new ArrayList<>();
    
    @Override
    public Auto crear(Auto a) {
        this.autoList.add(a);
        return a;
    }

    @Override
    public Auto modificar(int y, Auto a) {
        this.autoList.set(this.buscarPosicion(y), a);
        return a;
    }

    @Override
    public Auto eliminar(int y) {
        var auto=this.autoList.get(this.buscarPosicion(y));
        this.autoList.remove(this.buscarPosicion(y));
        return auto;
    }

    @Override
    public List<Auto> listar() {
        return this.autoList;
    }

    @Override
    public int buscarPosicion(int y) {  
        var posicion=-1;
        var i=0;
        for(var auxAuto:this.autoList){
            if(auxAuto.getYear()==y){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    
}
