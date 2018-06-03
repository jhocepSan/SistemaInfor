/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

import java.util.Calendar;

/**
 *
 * @author sajhy
 */
public class Edificio {
    public void Edificio(){
    
    }
    public boolean esEmpleado(String ci){
        return true;
    }
    public void agregarEmpleado(){
    }
    public void agragarResidente(String ci){
        
    }
    
    public boolean validarResidente(int anioNacimiento)
    { 
        Calendar cal= Calendar.getInstance();
        //cliente=new DatoPersonal();
        return (cal.get(Calendar.YEAR))-anioNacimiento>=18;
    } 
    public boolean validarIngesos(int salario, int precioInmueble)
    {
            return salario>precioInmueble;
    }
    public boolean esResidente(int ci,String codSala){
        return true;
    }
}
