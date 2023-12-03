package Main;

import Listas.*;

public class Main {

	public static void main(String[] args) {
		
		Lista list = new Pilha(10);
		ListaFacade lf = new ListaFacade(list);
		
		lf.inserir(3);	
		lf.inserir(5);
		lf.inserir(2);
		String l = lf.mostrar();
		System.out.print(l);
		
		lf.ordenar();
		l = lf.mostrar();
		
		System.out.print(l);
		
		
		lf.remover(3);
		l = lf.mostrar();
		
		System.out.print(l);
		
		}

}
