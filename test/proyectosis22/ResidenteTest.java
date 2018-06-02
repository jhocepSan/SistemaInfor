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

   
    
    
}
