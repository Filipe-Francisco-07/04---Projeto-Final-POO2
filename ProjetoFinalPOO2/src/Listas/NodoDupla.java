package Listas;

public class NodoDupla {
	private int dado;
	private NodoDupla prox;
	private NodoDupla ant;
	
	public NodoDupla(int dado) {
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

	public NodoDupla getProx() {
		return prox;
	}

	public void setProx(NodoDupla prox) {
		this.prox = prox;
	}

	public NodoDupla getAnt() {
		return ant;
	}

	public void setAnt(NodoDupla ant) {
		this.ant = ant;
	}
	
	
}