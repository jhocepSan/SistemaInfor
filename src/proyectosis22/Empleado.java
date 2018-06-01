/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

/**
 *
 * @author sajhy
 */
public class Empleado {
    DatoPersonal dato;
    String cargo;
    Fecha fecha;
    int sueldo;
    public Empleado(DatoPersonal dato,String cargo,Fecha fecha,int sueldo){
        this.dato=dato;
        this.cargo=cargo;
        this.fecha=fecha;
        this.sueldo=sueldo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public int getSueldo(){
        return this.sueldo;
    }
}
