package Tests;

import junit.framework.TestCase;
import paqueteClases.BonoCompleto;
import paqueteClases.BonoNulo;
import paqueteClases.Categoria;
import paqueteClases.Empleado;

public class EmpleadoTest extends TestCase {
    private BonoCompleto bonocompleto = new BonoCompleto();
    private BonoNulo bonoNulo = new BonoNulo();
    private Categoria cadete =new Categoria();
    private Categoria gerente =new Categoria();
    private Empleado pepe=new Empleado();

    public void setUp() {
        cadete.setSueldoneto(10000);
        gerente.setSueldoneto(15000);
        pepe.setCantidadFaltas(0);
    }

    public void testSueldoGerenteBonoCompleto(){
        pepe.setCategoria(gerente); //Tengo que pasar todos los parametros para que pueda hacer el sueldo()
        pepe.setCantidadFaltas(2);
        pepe.setBono(bonocompleto);
        assertTrue(pepe.sueldo()==15000);
    }

    public void testSueldoCadeteBonoCompleto(){
        pepe.setCategoria(cadete); //Tengo que pasar todos los parametros para que pueda hacer el sueldo()
        pepe.setCantidadFaltas(0);
        pepe.setBono(bonocompleto);
        assertTrue(pepe.sueldo()==10100);
    }

    public void testSueldoCadeteBonoNulo(){
        pepe.setCategoria(cadete); //Tengo que pasar todos los parametros para que pueda hacer el sueldo()
        pepe.setCantidadFaltas(0); // Por mas que no falte el bono nulo suma 0
        pepe.setBono(bonoNulo);
        assertTrue(pepe.sueldo()==10000);
    }

    public void testSueldoGerenteBonoCompletoUnaFalta(){
        pepe.setCategoria(gerente); //Tengo que pasar todos los parametros para que pueda hacer el sueldo()
        pepe.setCantidadFaltas(1);
        pepe.setBono(bonocompleto);
        assertTrue(pepe.sueldo()==15050);
    }
}