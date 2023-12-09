package Main;

import Listas.*;

public class Main {

	public static void main(String[] args) {
		
		ListaFactory lfactory = new ListaFactory();
		Lista listCirc = lfactory.createLista("circular");
		Lista listEncad = lfactory.createLista("encadeada");
		
		ListaComposite l = new ListaComposite();		
		
		l.adicionarLista(listCirc);
		l.adicionarLista(listEncad);
		
		l.inserir(3);	
		l.inserir(5);
		l.inserir(2);
		String saida = l.mostrar();
		System.out.print(saida);
		
		l.ordenar();
		saida = l.mostrar();
		
		System.out.print(saida);
		
		l.remover(3);
		saida = l.mostrar();
		
		System.out.print(saida);
	
		}
}
