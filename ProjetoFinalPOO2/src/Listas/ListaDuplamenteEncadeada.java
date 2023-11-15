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
	
	public String mostrar() {
		String lista ="";
		if(inicio == null)return lista;
		NodoDupla aux = inicio;
		while(aux != null) {
			lista+=(aux.getDado()+"\n");
			aux = aux.getProx();
		}
		return lista;

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
	    if (inicio == null || inicio.getProx() == null) {
	        return; 
	    }

	    boolean trocou;
	    NodoDupla atual;
	    NodoDupla proximo = null;

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
	    NodoDupla aux = inicio;
	    while (aux != null) {
	        tamanho++;
	        aux = aux.getProx();
        }
        return tamanho;
    }

    @Override
    public Lista copiar() {
        ListaDuplamenteEncadeada copia = new ListaDuplamenteEncadeada();
        NodoDupla aux = inicio;
        while (aux != null) {
            copia.inserirFinal(aux.getDado());
            aux = aux.getProx();
        }
        return copia;
    }

    @Override
    public void inverter() {
        NodoDupla aux = inicio;
        while (aux != null) {
            NodoDupla temp = aux.getProx();
            aux.setProx(aux.getAnt());
            aux.setAnt(temp);
            aux = temp;
        }
        NodoDupla temp = inicio;
        inicio = fim;
        fim = temp;
    }

    @Override
    public boolean buscar(int valor) {
        NodoDupla aux = inicio;
        while (aux != null) {
            if (aux.getDado() == valor) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

}
	