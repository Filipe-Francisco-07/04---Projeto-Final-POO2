package Listas;
/**
 * Classe Nodo
 * @author filipefranciscof3@gmail.com
 * @param dado elemento que vai ser utilizado para armazenar nas listas;
 * @param prox ponteiro que aponta para o proximo elemento da lista;
 * @param ant ponteiro que aponta para o elemento anterior da lista( so e utilizado em algumas listas).
 */
public class Nodo {
	private int dado;
	private Nodo prox;
	private Nodo ant;
	
	/**
	 * Construtor do nodo
	 * @param dado elemento que vai ser utilizado para armazenar nas listas;
	 */
	public Nodo(int dado) {
		this.dado = dado;
		prox = null;
		ant = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	public Nodo getAnt() {
		return ant;
	}

	public void setAnt(Nodo ant) {
		this.ant = ant;
	}
	
	
}