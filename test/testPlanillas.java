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
import proyectosis22.DatoPersonal;
import proyectosis22.Edificio;
import proyectosis22.Fecha;
import proyectosis22.Residente;

/**
 *
 * @author elvis
 */
public class testPlanillas {
    
    public testPlanillas() {
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
     public void guardarPlanilla(){
         Edificio nuevo= new Edificio();
        Fecha fecha=new Fecha(10,10,2000);
        DatoPersonal datos=new DatoPersonal(21547896,"Elvis","Gomez","Marca",fecha,"Ingeniero",8000);
        String codSala="5G5";
        Residente residente = new Residente(datos,codSala);
        assertTrue("planilla almacenada",nuevo.llenarPlanillaAmbientes(residente, codSala));
    }

}
