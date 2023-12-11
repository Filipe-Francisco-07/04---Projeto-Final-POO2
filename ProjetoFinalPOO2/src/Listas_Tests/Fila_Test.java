package Listas_Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Listas.Fila;

class Fila_Test {

	@Test
    void testInserir() {
        Fila f = new Fila(10);
        f.inserir(1);
        assertEquals(1, f.getInicio().getDado());
        f.inserir(2);
        assertEquals(2, f.getInicio().getProx().getDado());
    }

    @Test
    void testRemover() {
        Fila f = new Fila(10);
        f.inserir(1);
        f.inserir(2);
        f.remover(1);
        assertEquals(2, f.getInicio().getDado());

    }

    @Test
    void testAlterar() {
        Fila f = new Fila(10);
        f.inserir(1);
        f.inserir(2);
        f.alterar(1, 3);
        assertEquals(3, f.getInicio().getDado());
        f.alterar(2, 4);
        assertEquals(4, f.getInicio().getProx().getDado());
    }

    @Test
    boolean testBuscar() {
        Fila f = new Fila(10);
        f.inserir(1);
        assertTrue(f.buscar(1));
        assertFalse(f.buscar(3));
        return false;
    }

    @Test
    String testMostrar() {
        Fila f = new Fila(10);
        f.inserir(1);
        f.inserir(2);
        assertEquals("1 2", f.mostrar());
        return "";
    }

    @Test
    void testOrdenar() {
        Fila f = new Fila(10);
        f.inserir(5);
        f.inserir(2);
        f.inserir(3);
        f.ordenar();
        assertEquals(2, f.getInicio().getDado());
        assertEquals(3, f.getInicio().getProx().getDado());
        assertEquals(5, f.getInicio().getProx().getProx().getDado());
    }

    @Test
    void testTamanho() {
        Fila f = new Fila(10);
        assertEquals(0, f.tamanho());
        f.inserir(1);
        assertEquals(1, f.tamanho());
        f.inserir(2);
        assertEquals(2, f.tamanho());
        f.remover(1);
        assertEquals(1, f.tamanho());
    }

    @Test
    void testCopiar() {
        Fila f = new Fila(10);
        f.inserir(1);
        f.inserir(2);
        Fila f2 = (Fila) f.copiar();
        assertEquals(f.getInicio().getDado(), f2.getInicio().getDado());
        assertEquals(f.getInicio().getProx().getDado(), f2.getInicio().getProx().getDado());
        assertEquals(true, f2 instanceof Fila);
    }

    @Test
    void testInverter() {
        Fila f = new Fila(10);
        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inverter();
        assertEquals(3, f.getInicio().getDado());
        assertEquals(2, f.getInicio().getProx().getDado());
        assertEquals(1, f.getInicio().getProx().getProx().getDado());
    }

}
