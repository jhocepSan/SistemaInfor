/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

import java.util.ArrayList;
import java.util.Calendar;


/**
 *
 * @author elvis
 */
public class Residente {
    DatoInmueble interes;
    DatoPersonal cliente;
    Fecha fechaIngreso;
    Fecha fechaSalida;
    int salario;
    String codSala;
   
    public Residente(DatoInmueble interes,DatoPersonal cliente,Fecha fechaIngreso,Fecha fechaSalida,int salario,String codSala){
        this.interes=interes;
        this.cliente=cliente;
        this.fechaIngreso=fechaIngreso;
        this.fechaIngreso=fechaSalida;
        this.salario=salario;
        this.codSala=codSala;
    }
    public Residente(DatoPersonal cliente,String codSala ){
        this.codSala=codSala;
    }
   public int getPrecioInmueble()
   {
       return interes.getPrecio();
   }
   public DatoPersonal getDatosCliente()
   {
       return this.cliente;
   }
   public Fecha getFechaIngreso()
   {
       return this.fechaIngreso;
   }
   public Fecha getFechaSalida()
   {
       return this.fechaSalida;
   }
   public int getSalario()
   {
       return this.salario;
   }
   public String getSala()
   {
       return this.codSala;
   }
   public void agredarFecha(Fecha fechaIngreso){
       this.fechaIngreso=fechaIngreso;
   }
   public void agregarDatoInmueble(DatoInmueble dato){
       
   }
   public ArrayList getDatosPersonales(){
       ArrayList datosP=new ArrayList();
       datosP.add(this.cliente.getCi());
       datosP.add(this.cliente.getNombre());
       datosP.add(this.cliente.getApellidoPaterno());
       datosP.add(this.cliente.getApellidoMaterno());
       datosP.add(this.cliente.getProfesion());
       datosP.add(this.cliente.getSueldo());
       return datosP;
   }
}
