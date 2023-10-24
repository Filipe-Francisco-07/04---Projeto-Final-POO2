package Main;

import Listas.Lista;
import Listas.ListaEncadeada;

public class Main {

	public static void main(String[] args) {

		Lista lista = new ListaEncadeada();
		
		lista.inserir(1);	
		lista.inserir(2);	
		lista.inserir(3);	
		lista.remover(2);
		
		lista.mostrar();
		
		
		}

}
