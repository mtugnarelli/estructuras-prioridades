package ar.edu.untref.edd2.prioridades;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PruebaColaDePrioridades {


    private ColaDePrioridades<Integer> cola;

    @Before
    public void crear() {
        
        cola = new ColaDePrioridades<Integer>();
    }
    
    @Test
    public void estaVaciaAlCrearse() {
        
        Assert.assertTrue(cola.estaVacia());
    }
    
    @Test
    public void luegoDeAcolarNoEstaVacia() {
        
        cola.acolar(1, 89);
        
        Assert.assertFalse(cola.estaVacia());
    }
    
    @Test
    public void luegoDeDesacolarElUnicoElementoEstaVacia() {
        
        cola.acolar(1, 334);
        cola.desacolar();
        
        Assert.assertTrue(cola.estaVacia());
    }
    
    @Test
    public void acolarUnUnicoElementoLuegoDesacolaElMismo() {
        
        cola.acolar(1, 343);
        
        int elemento = cola.desacolar();
        
        Assert.assertEquals(343, elemento);
    }
    
    @Test
    public void acolaTresElementoConLaMismaPrioridadLosDesacolaPorOrdenDeLlegada() {
        
        cola.acolar(1, 923);
        cola.acolar(1, 99);
        cola.acolar(1, 1921);
        
        int primero = cola.desacolar();
        int segundo = cola.desacolar();
        int tercero = cola.desacolar();
        
        Assert.assertEquals(923, primero);
        Assert.assertEquals(99, segundo);
        Assert.assertEquals(1921, tercero);
    }
    
    @Test
    public void acolarTresElementosConPrioridadCrecienteDesacolaPorPrioridadDecreciente() {
        
        cola.acolar(1, 5874);
        cola.acolar(2, 2346);
        cola.acolar(3, 293);
        
        int primero = cola.desacolar();
        int segundo = cola.desacolar();
        int tercero = cola.desacolar();
        
        Assert.assertEquals(293, primero);
        Assert.assertEquals(2346, segundo);
        Assert.assertEquals(5874, tercero);
    }
    
    @Test
    public void acolarCuatroElementosConPrioridadIntercambiadaDesacolaPorPrioridadOrden() {
        
        cola.acolar(1, 58845);
        cola.acolar(2, 55);
        cola.acolar(1, 742);
        cola.acolar(2, 985);
        
        int primero = cola.desacolar();
        int segundo = cola.desacolar();
        int tercero = cola.desacolar();
        int cuarto = cola.desacolar();
        
        Assert.assertEquals(55, primero);
        Assert.assertEquals(985, segundo);
        Assert.assertEquals(58845, tercero);
        Assert.assertEquals(742, cuarto);
    }
    
    @Test(expected = Throwable.class)
    public void descolarConLaColaVaciaGeneraUnaExcepcion() {
        
        cola.desacolar();
    }

    @Test(expected = Throwable.class)
    public void descolarConLaColaVaciaLuegoDeDesacolarTodosLosElementosGeneraUnaExcepcion() {
        
        cola.acolar(2, 23);
        cola.acolar(11, 433);
        cola.acolar(7, 2433);
        
        cola.desacolar();
        cola.desacolar();
        cola.desacolar();
        
        cola.desacolar();   
    }

}
