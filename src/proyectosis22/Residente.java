/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

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
    String ocupacion;
   
    public Residente(DatoInmueble interes,DatoPersonal cliente,Fecha fechaIngreso,Fecha fechaSalida,int salario,String acupacion){
        this.interes=interes;
        this.cliente=cliente;
        this.fechaIngreso=fechaIngreso;
        this.fechaIngreso=fechaSalida;
        this.salario=salario;
        this.ocupacion=ocupacion;
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
   public String getOcupacion()
   {
       return this.ocupacion;
   }
}
