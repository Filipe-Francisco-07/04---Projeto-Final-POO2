package Main;

import Listas.*;

public class Main {

	public static void main(String[] args) {
		
		ListaFactory lfactory = new ListaFactory();
		Lista listCirc = lfactory.createLista("circular");
		Lista listEncad = lfactory.createLista("encadeada");
		
		ListaComposite comp = new ListaComposite();		
		
		comp.adicionarLista(listCirc);
		comp.adicionarLista(listEncad);
		
		comp.inserir(3);	
		comp.inserir(5);
		comp.inserir(2);
		String saida = comp.mostrar();
		System.out.print(saida);
		
		comp.ordenar();
		saida = comp.mostrar();
		
		System.out.print(saida);
		
		comp.remover(3);
		saida = comp.mostrar();
		
		System.out.print(saida);
	
		}
}
