/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author sajhy
 */
public class Edificio {
    public String url = "jdbc:mysql://localhost:3306/sis2";
    public String user = "root";
    public String pass = "";
    public void Edificio(){
    
    }
    public boolean esEmpleado(String ci){
        return true;
    }
    public void agregarEmpleado(){
    }
    public boolean agragarResidente(Residente residente){
        ArrayList datos=residente.getDatosPersonales();
        try (Connection connection = (Connection) DriverManager.getConnection(url, user, pass)) {
            PreparedStatement s;
            s = (PreparedStatement) connection.prepareStatement("insert into registroempleados (id_empleado,nombre_apellidos,ci,fecha_nacimiento,nacionalidad,area_trabajo,telefono,direccion) VALUE (?,?,?,?,?,?,?,?)");
            s.setString(1, (String) datos.get(0));
            s.setString(2,(String)datos.get(1));
            s.setString(3,(String)datos.get(2));
            s.setString(4,(String)datos.get(3));
            s.setString(5,(String)datos.get(4));
            s.setString(6,(String)datos.get(5));
            int res = s.executeUpdate();
            s.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
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
    public void MostrarPlanillaAmbientes()
    {
        try (Connection connection = (Connection) DriverManager.getConnection(url, user, pass)) {
            PreparedStatement s;
            s = (PreparedStatement) connection.prepareStatement("select * from planilla");
            
          
            ResultSet rs = s.executeQuery();
            while (rs.next()){
            // tratamos los datos
            System.out.println(rs.getString("idInquilino"));
            System.out.println(rs.getString("habitacion"));
            
            }
            s.close();
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
    
     public boolean llenarPlanillaAmbientes(Residente residente,String codHabitacion)
    {   
        ArrayList datos=residente.getDatosPersonales();
        try (Connection connection = (Connection) DriverManager.getConnection(url, user, pass)) {
            PreparedStatement s;
            s = (PreparedStatement) connection.prepareStatement("insert into planilla (idInquilino,habitacion) VALUE (?,?)");
            
            s.setString(1,(String)datos.get(2));
            s.setString(2,codHabitacion);
            
            int res = s.executeUpdate();
            s.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
