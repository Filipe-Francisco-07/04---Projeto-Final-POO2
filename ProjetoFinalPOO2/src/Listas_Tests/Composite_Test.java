package Listas_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Listas.*;

class Composite_Test {

	@Test
	void testInserir() {
		ListaCircular l = new ListaCircular();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.inserir(1);
		assertEquals(1, l.getInicio().getDado());
		c.inserir(2);
		assertEquals(2, l.getInicio().getDado());
		assertEquals(1, l.getInicio().getProx().getDado());
	}
	
	@Test
	void testRemover() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(1);
		c.inserir(2);
		c.remover(1);
		assertEquals(2, l.getInicio().getDado());
		assertEquals(2, le.getInicio().getDado());
	}
	
	@Test
	void testAlterar() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(1);
		c.inserir(2);
		c.alterar(1, 3);
		assertEquals(3, l.getInicio().getProx().getDado());
		l.alterar(2, 4);
		assertEquals(4, l.getInicio().getDado());
		assertEquals(3, le.getInicio().getProx().getDado());
		le.alterar(2, 4);
		assertEquals(4, le.getInicio().getDado());
	}
	@Test
	void testBuscar() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(1);
		c.inserir(2);
		assertTrue(l.buscar(1));
		assertFalse(l.buscar(3));
		assertTrue(le.buscar(1));
		assertFalse(le.buscar(3));
	}
	@Test
	void testMostrar() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(1);
		assertEquals("1\n", l.mostrar());
		assertEquals("1\n", le.mostrar());
	}
	
	@Test
	void testOrdenar() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(5);
		c.inserir(2);
		c.inserir(3);
		c.ordenar();
		assertEquals(2, l.getInicio().getDado());
		assertEquals(3, l.getInicio().getProx().getDado());
		assertEquals(5, l.getInicio().getProx().getProx().getDado());
		assertEquals(2, le.getInicio().getDado());
		assertEquals(3, le.getInicio().getProx().getDado());
		assertEquals(5, le.getInicio().getProx().getProx().getDado());
	}
	@Test
	int testTamanho() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		assertEquals(0, l.tamanho());
		c.inserir(1);
		assertEquals(1, l.tamanho());
		c.inserir(2);
		assertEquals(2, le.tamanho());
		c.remover(1);
		assertEquals(1, le.tamanho());
		c.remover(2);
		assertEquals(0, le.tamanho());
		return 0;
	}
	
	@Test
	void testCopiar() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
	    c.inserir(1);
	    c.inserir(2);
	    ListaComposite c2 = (ListaComposite) c.copiar();
	    assertEquals(c.getInicio().getDado(), c2.getInicio().getDado());

	 
	}
	
	@Test
	void testInverter() {
		ListaCircular l = new ListaCircular();
		ListaEncadeada le = new ListaEncadeada();
		ListaComposite c = new ListaComposite();
		c.adicionarLista(l);
		c.adicionarLista(le);
		c.inserir(1);   
		c.inserir(2);   
		c.inserir(3);   
		c.inverter();
		assertEquals(1, l.getInicio().getDado());
		assertEquals(2, l.getInicio().getProx().getDado());
		assertEquals(3, l.getInicio().getProx().getProx().getDado());
		assertEquals(1, le.getInicio().getDado());
		assertEquals(2, le.getInicio().getProx().getDado());
		assertEquals(3, le.getInicio().getProx().getProx().getDado());
	}

}
