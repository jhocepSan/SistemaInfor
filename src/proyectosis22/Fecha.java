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
public class Fecha {
    int dia;
    int mes;
    int anio;
    public Fecha(int dia,int mes,int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public boolean mesValido(){
        return this.mes>0 && this.mes<=12;
    }
}
