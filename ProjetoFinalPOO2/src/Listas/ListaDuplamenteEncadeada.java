package Listas;

public class ListaDuplamenteEncadeada implements Lista {
	private NodoDupla inicio;
	private NodoDupla fim;
	
	
	
	public void inserir(int dado) {
		NodoDupla novo = new NodoDupla(dado);
		if(inicio != null) {
			inicio.setAnt(novo);
			novo.setProx(inicio);
		}
		inicio = novo;
		if(fim == null) {
			fim = novo;
		}
	}
	public void inserirFinal(int dado) {
		NodoDupla novo = new NodoDupla(dado);
		if(fim != null) {
			fim.setProx(novo);
			novo.setAnt(fim);
		}
		fim = novo;
		if(inicio == null) {
			inicio = novo;
		}
	}
	
	public void alterar(int valorAntigo, int novoValor) {
	    NodoDupla aux = inicio;
	    while (aux != null) {
	        if (aux.getDado() == valorAntigo) {
	            aux.setDado(novoValor);
	            return;
	        }
	        aux = aux.getProx();
	    }
	    System.out.println("Valor antigo não encontrado na lista. A alteração não foi realizada.");
	}
	
	public void removerInicio() {
		NodoDupla nodoRemovido = inicio;
		if(inicio == null) return;
				
		inicio = inicio.getProx();
		if(inicio != null) {
			inicio.setAnt(null);
		}
		if(nodoRemovido == fim) {
			removerFinal();
		}
	}
	
	public void removerFinal() {
		NodoDupla nodoRemovido = fim;
		if(fim == null) return;
				
		fim = fim.getAnt();
		if(fim != null) {
			fim.setProx(null);
		}
		if(nodoRemovido == inicio) {
			removerInicio();
		}
	}
	public void remover(int valor) {
		NodoDupla nodoRemovido = null;
		NodoDupla aux = inicio;
		while(aux != null) {
			if(aux.getDado()== valor) {
				nodoRemovido = aux;
				break;
			}
			aux = aux.getProx();
		}
		if(nodoRemovido == null) return;
		
		if(nodoRemovido == inicio) {
			removerInicio();
		}else if(nodoRemovido == fim) {
			removerFinal();
		}else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
		}
	}
	
	public void mostrar() {
		String lista ="";
		if(inicio == null)System.out.println("Lista vazia.");
		NodoDupla aux = inicio;
		while(aux != null) {
			lista+=(aux.getDado()+"\n");
			aux = aux.getProx();
		}
		System.out.println(lista);

	}
	
	public NodoDupla getInicio() {
		return inicio;
	}

	public void setInicio(NodoDupla inicio) {
		this.inicio = inicio;
	}

	public NodoDupla getFim() {
		return fim;
	}

	public void setFim(NodoDupla fim) {
		this.fim = fim;
	}
	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Lista copiar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void inverter() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean buscar(int valor) {
		// TODO Auto-generated method stub
		return false;
	}



}
	