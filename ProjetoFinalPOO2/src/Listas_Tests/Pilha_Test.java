package Listas_Tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Listas.Lista;
import Listas.Pilha;

class Pilha_Test {

	@Test
	void testInserir() {
		Lista p = new Pilha(10);
		p.inserir(1);
		p.inserir(2);
		assertEquals(true,p.buscar(2));
	}
	
	@Test
	void testRemover() {
		Lista p = new Pilha(10);
		p.inserir(1);
		p.inserir(2);
		p.remover(2);
		assertEquals(false,p.buscar(2));
	}
	
	@Test
	void testAlterar() {
		Lista p = new Pilha(10);
		p.inserir(1);
		p.inserir(2);
		p.alterar(2,7);
		assertEquals(true,p.buscar(7));
		assertEquals(false,p.buscar(2));
	}
	@Test
	void testBuscar() {
		Lista p = new Pilha(10);
		p.inserir(1);
		p.inserir(2);
		assertEquals(true,p.buscar(1));
		assertEquals(true,p.buscar(2));
	}
	
	@Test
	void testMostrar() {
		Lista p = new Pilha(100);
		p.inserir(1);

		assertEquals("1\n",p.mostrar());
	}
	
	@Test
	void testOrdenar() {
		Pilha p = new Pilha(100);
		p.inserir(3);
		p.inserir(2);
		p.inserir(1);
		p.inserir(6);
		p.inserir(12);
		p.ordenar();
		
		assertEquals(1,p.getTopo());
	
	}
	@Test
	void testTamanho() {
		Pilha p = new Pilha(100);
		p.inserir(1);
		p.inserir(2);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		
		assertEquals(5,p.tamanho());
	}
	
	@Test
	void testCopiar() {
	    Pilha p = new Pilha(10);
        p.inserir(1);
        p.inserir(2);
        Pilha p2 = (Pilha) p.copiar();
        assertEquals(p.getTopo(), p2.getTopo());
        assertEquals(true, p2 instanceof Pilha);
	}
	
	@Test
	void testInverter() {
		Pilha p = new Pilha(100);
		p.inserir(1);
		p.inserir(2);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		
		p.inverter();
		
		assertEquals(5,p.getTopo());
	}
	

}
