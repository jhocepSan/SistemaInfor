/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

/**
 *
 * @author elvis
 */
public class DatoInmueble {
    String detalleImueble;
    int precio;
    
    public DatoInmueble(String detalleInmueble,int precio)
    {
        this.detalleImueble=detalleInmueble;
        this.precio=precio;
    }
    public int getPrecio()
    {
        return this.precio;
    }
}
