package Listas_Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Listas.Lista;
import Listas.ListaEncadeada;


class Encadeada_Test {
	 @Test
	    void testInserir() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        assertEquals(1, l.getInicio().getDado());
	        l.inserir(2);
	        assertEquals(2, l.getInicio().getProx().getDado());
	        assertEquals(1, l.getInicio().getDado());
	    }

	    @Test
	    void testRemover() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        l.remover(1);
	        assertEquals(2, l.getInicio().getDado());
	        l.remover(2);
	        assertEquals(null, l.getInicio());
	    }

	    @Test
	    void testAlterar() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        l.alterar(1, 3);
	        assertEquals(3, l.getInicio().getDado());
	        l.alterar(2, 4);
	        assertEquals(4, l.getInicio().getProx().getDado());
	    }

	    @Test
	    void testBuscar() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        assertTrue(l.buscar(1));
	        assertFalse(l.buscar(3));
	    }

	    @Test
	    void testMostrar() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        assertEquals("1 2", l.mostrar());

	    }

	    @Test
	    void testOrdenar() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(5);
	        l.inserir(2);
	        l.inserir(3);
	        l.ordenar();
	        assertEquals(2, l.getInicio().getDado());
	        assertEquals(3, l.getInicio().getProx().getDado());
	        assertEquals(5, l.getInicio().getProx().getProx().getDado());
	    }

	    @Test
	    void testTamanho() {
	        ListaEncadeada l = new ListaEncadeada();
	        assertEquals(0, l.tamanho());
	        l.inserir(1);
	        assertEquals(1, l.tamanho());
	        l.inserir(2);
	        assertEquals(2, l.tamanho());
	        l.remover(1);
	        assertEquals(1, l.tamanho());
	        l.remover(2);
	        assertEquals(0, l.tamanho());

	    }

	    @Test
	    Lista testCopiar() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        Lista l2 = l.copiar();
	        assertEquals(l.getInicio().getDado(), l2.getInicio().getDado());
	        assertEquals(l.getInicio().getProx().getDado(), l2.getInicio().getProx().getDado());
	        assertEquals(true, l2 instanceof Lista);
	        return l2;
	    }

	    @Test
	    void testInverter() {
	        ListaEncadeada l = new ListaEncadeada();
	        l.inserir(1);
	        l.inserir(2);
	        l.inserir(3);
	        l.inverter();
	        assertEquals(3, l.getInicio().getDado());
	        assertEquals(2, l.getInicio().getProx().getDado());
	        assertEquals(1, l.getInicio().getProx().getProx().getDado());
	    }


}
