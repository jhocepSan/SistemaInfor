/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectosis22.*;

/**
 *
 * @author sajhy
 */
public class TestUsis2 {
    
    public TestUsis2() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void esEmpleado(){
        Edificio edificio=new Edificio();
        String ci="23134";
        assertTrue("Es empleado del Edificio", edificio.esEmpleado(ci));
    }
    @Test
    public void mesValido(){
        Fecha fecha;
        fecha = new Fecha(20,4,2018);
        assertTrue("Mes Correcto",fecha.mesValido());
    }
    @Test
    public void mesErroneo(){
        Fecha fecha=new Fecha(20,78,2018);
        assertFalse(fecha.mesValido());
    }
    @Test
    public void tieneDescuento(){
        
    }
    
}
