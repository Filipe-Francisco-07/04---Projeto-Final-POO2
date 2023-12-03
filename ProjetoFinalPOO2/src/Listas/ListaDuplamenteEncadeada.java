package Listas;
/**
 * Classe da estrutura de dados Lista Duplamente Encadeada.
 * @author filipefranciscof3@gmail.com
 * 
 * @param inicio Parâmetro que utiliza a classe nodo e marca o primeiro elemento presente na fila;
 * @param fim Parâmetro que utiliza a classe nodo e marca o último elemento presente na fila;
 */
public class ListaDuplamenteEncadeada implements Lista {
	private Nodo inicio;
	private Nodo fim;
	/**
	 * Construtor da lista duplamente encadeada.
	 */
	public ListaDuplamenteEncadeada() {
		inicio = null;
		fim = null;
	}
	
	public void inserir(int dado) {
		Nodo novo = new Nodo(dado);
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
		Nodo novo = new Nodo(dado);
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
	    Nodo aux = inicio;
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
		Nodo nodoRemovido = inicio;
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
		Nodo nodoRemovido = fim;
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
		Nodo nodoRemovido = null;
		Nodo aux = inicio;
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
	
	public String mostrar() {
		String lista ="";
		if(inicio == null)return lista;
		Nodo aux = inicio;
		while(aux != null) {
			lista+=(aux.getDado()+"\n");
			aux = aux.getProx();
		}
		return lista;

	}
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getFim() {
		return fim;
	}

	public void setFim(Nodo fim) {
		this.fim = fim;
	}
	@Override
	public void ordenar() {
	    if (inicio == null || inicio.getProx() == null) {
	        return; 
	    }

	    boolean trocou;
	    Nodo atual;
	    Nodo proximo = null;

	    do {
	        trocou = false;
	        atual = inicio;

	        while (atual.getProx() != proximo) {
	            if (atual.getDado() > atual.getProx().getDado()) {
	                int temp = atual.getDado();
	                atual.setDado(atual.getProx().getDado());
	                atual.getProx().setDado(temp);
	                trocou = true;
	            }
	            atual = atual.getProx();
	        }
	        proximo = atual;
	    } while (trocou);
	}
	@Override
	public int tamanho() {
	    int tamanho = 0;
	    Nodo aux = inicio;
	    while (aux != null) {
	        tamanho++;
	        aux = aux.getProx();
        }
        return tamanho;
    }

    @Override
    public ListaDuplamenteEncadeada copiar() {
        ListaDuplamenteEncadeada copia = new ListaDuplamenteEncadeada();
        Nodo aux = inicio;
        while (aux != null) {
            copia.inserirFinal(aux.getDado());
            aux = aux.getProx();
        }
        return copia;
    }

    @Override
    public void inverter() {
        Nodo aux = inicio;
        while (aux != null) {
            Nodo temp = aux.getProx();
            aux.setProx(aux.getAnt());
            aux.setAnt(temp);
            aux = temp;
        }
        Nodo temp = inicio;
        inicio = fim;
        fim = temp;
    }

    @Override
    public boolean buscar(int valor) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDado() == valor) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

}
	