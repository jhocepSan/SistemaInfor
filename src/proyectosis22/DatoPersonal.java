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
public class DatoPersonal {
    int ci;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    Fecha fechaNacimiento;
    String profecion;
    int sueldo;

    public DatoPersonal(int ci,String nombre,String apellidoPaterno,String apellidoMaterno,Fecha fechaNacimiento,String profecion,
    int sueldo)
    {
        this.ci=ci;
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.fechaNacimiento=fechaNacimiento;
        this.profecion=profecion;
        this.sueldo= sueldo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellidoPaterno()
    {
        return this.apellidoPaterno;
    }
    public String getApellidoMaterno()
    {
        return this.apellidoMaterno;
    }
    public Fecha getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }
    public int getCi()
    {
        return this.ci;
    }
    public int getSueldo()
    {
        return this.ci;
    }
    public String getProfesion()
    {
        return this.profecion;
    }
    public boolean ciValido(){
        int numDigitos=String.valueOf(this.ci).length();
        return numDigitos>6 && numDigitos<8;
    }
    public String getApellidos(){
        return this.apellidoMaterno.concat(" ").concat(this.apellidoPaterno);
    }
}
