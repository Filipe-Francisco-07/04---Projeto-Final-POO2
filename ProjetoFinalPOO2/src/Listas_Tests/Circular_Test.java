package Listas_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Listas.*;


class Circular_Test {

	@Test
	void testInserir() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);
		assertEquals(1, l.getInicio().getDado());
		l.inserir(2);
		assertEquals(2, l.getInicio().getDado());
		assertEquals(1, l.getInicio().getProx().getDado());
	}
	
	@Test
	void testRemover() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);
		l.inserir(2);
		l.remover(1);
		assertEquals(2, l.getInicio().getDado());
	}
	
	@Test
	void testAlterar() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);
		l.inserir(2);
		l.alterar(1, 3);
		assertEquals(3, l.getInicio().getProx().getDado());
		l.alterar(2, 4);
		assertEquals(4, l.getInicio().getDado());
	}
	@Test
	void testBuscar() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);
		l.inserir(2);
		assertTrue(l.buscar(1));
		assertFalse(l.buscar(3));
	}
	@Test
	void testMostrar() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);
		assertEquals("1\n", l.mostrar());
	}
	
	@Test
	void testOrdenar() {
		ListaCircular l = new ListaCircular();
		l.inserir(5);
		l.inserir(2);
		l.inserir(3);
		l.ordenar();
		assertEquals(2, l.getInicio().getDado());
		assertEquals(3, l.getInicio().getProx().getDado());
		assertEquals(5, l.getInicio().getProx().getProx().getDado());
	}
	@Test
	int testTamanho() {
		ListaCircular l = new ListaCircular();
		assertEquals(0, l.tamanho());
		l.inserir(1);
		assertEquals(1, l.tamanho());
		l.inserir(2);
		assertEquals(2, l.tamanho());
		l.remover(1);
		assertEquals(1, l.tamanho());
		l.remover(2);
		assertEquals(0, l.tamanho());
		return 0;
	}
	
	@Test
	void testCopiar() {
	    ListaCircular l = new ListaCircular();
	    l.inserir(1);
	    l.inserir(2);
	    ListaCircular l2 = l.copiar();
	    assertEquals(l.getInicio().getDado(), l2.getInicio().getDado());
	 
	}
	
	@Test
	void testInverter() {
		ListaCircular l = new ListaCircular();
		l.inserir(1);   
		l.inserir(2);   
		l.inserir(3);   
		l.inverter();
		assertEquals(1, l.getInicio().getDado());
		assertEquals(2, l.getInicio().getProx().getDado());
		assertEquals(3, l.getInicio().getProx().getProx().getDado());
	}

}
