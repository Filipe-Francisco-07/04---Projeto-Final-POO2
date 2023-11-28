package Main;

import Listas.*;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Pilha(10);
		
		lista.inserir(3);	
		lista.inserir(5);
		lista.inserir(2);
		String l = lista.mostrar();
		System.out.print(l);
		
		lista.ordenar();
		l = lista.mostrar();
		
		System.out.print(l);
		
		
		lista.remover(3);
		l = lista.mostrar();
		
		System.out.print(l);
		
		}

}
