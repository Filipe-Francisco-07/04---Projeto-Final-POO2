package Listas_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Listas.Lista;
import Listas.ListaCircular;
import Listas.ListaDuplamenteEncadeada;

class DuplamenteEncadeada_Test {

	@Test
	void testInserir() {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		assertEquals(1, l.getInicio().getDado());
		l.inserir(2);
		assertEquals(1, l.getInicio().getProx().getDado());
		assertEquals(2, l.getInicio().getDado());
		l.inserir(3);
		assertEquals(1, l.getInicio().getProx().getProx().getDado());
		assertEquals(2, l.getInicio().getProx().getDado());
		assertEquals(3, l.getInicio().getDado());
	}

	@Test
	void testRemover() {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		l.inserir(2);
		l.remover(1);
		assertEquals(2, l.getInicio().getDado());
		l.remover(2);
		assertEquals(null, l.getInicio());
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
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		l.inserir(2);
		assertTrue(l.buscar(1));
		assertFalse(l.buscar(3));
	}
	
	@Test
	void testMostrar() {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		assertEquals("1\n", l.mostrar());
	}

	@Test
	void testOrdenar() {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
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
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
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
	void testCopiar() {
		Lista l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		l.inserir(2);
		Lista l2 = l.copiar();
		assertEquals(l.getInicio().getDado(), l2.getInicio().getDado());
		assertEquals(l.getInicio().getProx().getDado(), l2.getInicio().getProx().getDado());
		assertEquals(true, l2 instanceof Lista);
	}
	
	@Test
	void testInverter() {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		l.inserir(1);
		l.inserir(2);
		l.inserir(3);
		l.inverter();
		assertEquals(1, l.getInicio().getDado());
		assertEquals(2, l.getInicio().getProx().getDado());
		assertEquals(3, l.getInicio().getProx().getProx().getDado());
	}
}
