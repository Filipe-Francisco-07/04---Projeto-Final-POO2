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
	 * Construtor do Nodo;
	 * @param dado Elemento que vai ser utilizado para armazenar nas listas;
	 */
	public Nodo(int dado) {
		this.dado = dado;
		prox = null;
		ant = null;
	}
	  /**
     * Metodo getDado: Pega o valor que esta armazenado no nodo;
     * 
     * @return Retorna o valor inteiro presente no nodo.
     */
	public int getDado() {
		return dado;
	}
	  /**
     * Metodo setDado: Atualiza o valor que esta armazenado no nodo;
     * 
     * @param dado Dado utilizado na atualizacao do valor do nodo.
     */
	public void setDado(int dado) {
		this.dado = dado;
	}
	  /**
     * Metodo getProx;
     * 
     * @return Retorna o Nodo que se encontra na proxima posicao do Nodo que chamou o metodo.
     */
	public Nodo getProx() {
		return prox;
	}
	  /**
     * Metodo setProx;
     * 
     * @param prox Parametro do tipo Nodo que sera o proximo do Nodo que chamou o metodo.
     */
	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	  /**
     * Metodo getAnt;
     * 
     * @return Retorna o Nodo que se encontra na posicao anterior do Nodo que chamou o metodo.
     */
	public Nodo getAnt() {
		return ant;
	}
	  /**
     * Metodo setAnt;
     * 
     * @param prox Parametro do tipo Nodo que sera o anterior do Nodo que chamou o metodo.
     */
	public void setAnt(Nodo ant) {
		this.ant = ant;
	}
}