/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosis22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elvis
 */
public class ResidenteTest {
    Edificio gelatina=new Edificio();
    Residente residente;
    public ResidenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrecioInmueble method, of class Residente.
     */
    @Test
   
    public void testGetEdadCliente() {
        Edificio edificio=new Edificio();
        int anio=1990;
         assertTrue("mayor de 18 anios", edificio.validarResidente(anio));
    }
    @Test
    public void residenteExite(){
        Fecha fecha=new Fecha(12,5,1990);
        DatoPersonal datos=new DatoPersonal(87183,"Marco","Perez","Toli",fecha,"abogado",1000);
        residente =new Residente(datos,"2G1");
        assertTrue("residente valido",gelatina.esResidente(datos.getCi(),residente.getSala()));
    }
 

    
    /**
     * Test of getSalario method, of class Residente.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
      Edificio edificio=new Edificio();
      int salario = 3000;
      int inmueble = 1500;
      assertTrue("salario mayor a precio del inmueble", edificio.validarIngesos(salario,inmueble ));
      
    }
    @Test
    public void ciValido(){
        Fecha fecha=new Fecha(12,5,1990);
        DatoPersonal datos=new DatoPersonal(8776183,"Marco","Perez","Toli",fecha,"abogado",1000);
        residente =new Residente(datos,"2G1");
        assertTrue("El ci Valido",datos.ciValido());
    }
    @Test
    public void ciNoValido(){
        Fecha fecha=new Fecha(12,5,1990);
        DatoPersonal datos=new DatoPersonal(768,"Marco","Perez","Toli",fecha,"abogado",1000);
        residente =new Residente(datos,"2G1");
        assertFalse("El ci Valido",datos.ciValido());
    }
    @Test
    public void guardarResidente(){
        Fecha fecha=new Fecha(12,5,1989);
        DatoPersonal datos=new DatoPersonal(76881264,"Maria","Lopez","Vega",fecha,"Enfermera",800);
        residente =new Residente(datos,"2G3");
        assertTrue("Almaceno Correctamente",gelatina.agragarResidente(residente));
    }
}
