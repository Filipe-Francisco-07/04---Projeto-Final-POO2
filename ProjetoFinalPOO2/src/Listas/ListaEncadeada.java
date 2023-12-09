package Listas;

/**
 * Classe da estrutura de dados Lista Duplamente Encadeada.
 * @author filipefranciscof3@gmail.com
 */
public class ListaEncadeada implements Lista{

	private Nodo inicio;
	/**
	 * Construtor da lista encadeada.
	 */
	public ListaEncadeada() {
		inicio = null;
	}
	/**
	 * Metodo Vazia, verifica se a lista esta vazia;
	 * @return retorna verdadeiro se o inicio for vazio.
	 */
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserir(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public String mostrar() {
	    StringBuilder resultado = new StringBuilder();

	    if (vazia()) {
	        resultado.append("Null list. :(\n");
	    } else {
	        Nodo aux = inicio;
	        while (aux != null) {
	            resultado.append(aux.getDado());
	            aux = aux.getProx();
	        }
	        resultado.append("\n");
	    }

	    return resultado.toString();
	}
	
	public void inserirFinal(int valor) {
		if(vazia()) {
			return;
		}
		
		Nodo aux = inicio;
		Nodo aux2 = inicio;
		
		while(aux2.getProx().getDado() != valor) {
			aux2 = aux2.getProx();
		}
		
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		
		if(aux.getProx() == null) {
			
		}
		
	}
	
	public void remover(int valor) {
		if(vazia()) {
			System.out.println("Null position, can't delete. :(");
			return;
		}
		if(inicio.getDado()== valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while(aux != null) {
			if(aux.getProx().getDado()==valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}		
	}
	
	public void deletarUltimo() {
		if(inicio == null) return;
		
		Nodo aux = inicio;
		Nodo ant = null;
		
		if(inicio.getProx()== null) {
			inicio = null;
			return;
		}
		
		while(inicio.getProx()== null) {
			ant = aux;
			aux = aux.getProx();
		}
		ant.setProx(null);
	}
	
	public boolean buscar(int valor) {
		if(vazia()){
			return false;
		}
	
		Nodo  aux = inicio;
		while(aux != null) {
			if(aux.getDado()==valor) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;
	}

	public void alterar(int valorAntigo, int novoValor) {
	    if (vazia()) {
	        System.out.println("A lista está vazia. Não é possível fazer a alteração.");
	        return;
	    }

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

	@Override
	public void ordenar() {
	    if (vazia() || inicio.getProx() == null) {
	        return; 
	    }

	    boolean trocou;

	    do {
	        trocou = false;
	        Nodo atual = inicio;
	        while (atual.getProx() != null) {
	            if (atual.getDado() > atual.getProx().getDado()) {
	                int temp = atual.getDado();
	                atual.setDado(atual.getProx().getDado());
	                atual.getProx().setDado(temp);
	                trocou = true;
	            }

	            atual = atual.getProx();
	        }
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
    public ListaEncadeada copiar() {
        ListaEncadeada copia = new ListaEncadeada();
        Nodo aux = inicio;

        while (aux != null) {
            copia.inserirFinal(aux.getDado());
            aux = aux.getProx();
        }

        return copia;
    }

    @Override
    public void inverter() {
        if (vazia()) {
            return;
        }

        Nodo anterior = null;
        Nodo atual = inicio;
        Nodo proximo;

        while (atual != null) {
            proximo = atual.getProx();
            atual.setProx(anterior);
            anterior = atual;
            atual = proximo;
        }

        inicio = anterior;
    }

}
