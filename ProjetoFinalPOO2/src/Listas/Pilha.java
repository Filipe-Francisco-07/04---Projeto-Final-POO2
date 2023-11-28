package Listas;

/**
 * Classe da estrutura de dados Pilha
 */

public class Pilha implements Lista{
	/**
	 * @param limite Define o numero maximo de elementos que a pilha tera.
	 * @param tamanho Define o numero de elementos que a pilha tem, é atualizado a cada inserção ou remoção.
	 * @param topo A pilha trabalha com o nodo chamado topo, que controla apenas o primeiro elemento da lista.
	 */
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	public Pilha(int limite) {
		this.limite=limite;
	}
	public int getTopo() {
		return topo.getDado();
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	public void inserir(int dado) {
		if (temEspaco()) {
			Nodo novo = new Nodo(dado);
			novo.setProx(topo);
			topo = novo;
	        tamanho++;
		} else {
	        System.out.println("Pilha cheia!!!");
	    }
	}


	public void remover(int dado) {
	    if (!estaVazio()) {
	        Nodo atual = topo;
	        Nodo anterior = null;

	        while (atual != null && atual.getDado() != dado) {
	            anterior = atual;
	            atual = atual.getProx();
	        }

	        if (atual != null) {
	            if (anterior == null) {
	                System.out.println(dado + " foi retirado da pilha!");
	                topo = atual.getProx();
	            } else {
	                System.out.println(dado + " foi retirado da pilha!");
	                anterior.setProx(atual.getProx());
	            }

	            tamanho--;
	        } else {
	            System.out.println(dado + " não encontrado na pilha!");
	        }
	    } else {
	        System.out.println("Pilha está vazia!");
	    }
	}

	 
	public void alterar(int valorAntigo, int novoValor) {
        if (!estaVazio()) {
            if (topo.getDado() == valorAntigo) {
                topo.setDado(novoValor);
                System.out.println("Valor alterado na pilha!");
            } else {
                System.out.println(valorAntigo + " não encontrado na pilha, a alteração não foi realizada.");
            }
        } else {
            System.out.println("Pilha está vazia, a alteração não foi realizada.");
        }
    }

	public String mostrar() {
	    StringBuilder resultado = new StringBuilder();
	    
	    if (!estaVazio()) {
	        Nodo aux = topo;
	        while (aux != null) {
	            resultado.append(aux.getDado());
	            aux = aux.getProx();
	        }
	        resultado.append("\n");
	    } else {
	        resultado.append("A pilha está vazia!\n");
	    }
	    
	    return resultado.toString();
	}

	public void ordenar() {
	    if (estaVazio() || tamanho == 1) {
	        return;
	    }

	    Nodo atual = topo;

	    while (atual != null) {
	        Nodo menor = atual;
	        Nodo aux = atual.getProx();

	        while (aux != null) {
	            if (aux.getDado() < menor.getDado()) {
	                menor = aux;
	            }

	            aux = aux.getProx();
	        }

	        if (menor != atual) {
	            int temp = atual.getDado();
	            atual.setDado(menor.getDado());
	            menor.setDado(temp);
	        }

	        atual = atual.getProx();
	    }
	}
    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public Lista copiar() {
        Pilha copia = new Pilha(limite);
        Nodo aux = topo;
        Pilha auxPilha = new Pilha(limite);

        while (aux != null) {
            auxPilha.inserir(aux.getDado());
            aux = aux.getProx();
        }

        while (!auxPilha.estaVazio()) {
            copia.inserir(auxPilha.getTopo());
            auxPilha.remover(auxPilha.getTopo());
        }

        return copia;
    }

    @Override
    public void inverter() {
        if (estaVazio() || tamanho == 1) {
            return; 
        }

        Pilha auxPilha = new Pilha(limite);

        while (!estaVazio()) {
            auxPilha.inserir(getTopo());
            remover(getTopo());
        }

        while (!auxPilha.estaVazio()) {
            inserir(auxPilha.getTopo());
            auxPilha.remover(auxPilha.getTopo());
        }
    }

    @Override
    public boolean buscar(int valor) {
        Nodo aux = topo;

        while (aux != null) {
            if (aux.getDado() == valor) {
                return true;
            }
            aux = aux.getProx();
        }

        return false;
    }
    
 // inserir (push)
 	public void push(int dado) {
 		if(temEspaco()) {
 			Nodo novo = new Nodo(dado);
 			novo.setProx(topo);
 			topo = novo;
 			tamanho++;
 		}else {
 			System.out.println("Pilha cheia!!!");
 		}
 	}
 	// remover (pop)
 	public void pop() {
 		if(!estaVazio()) {
 			System.out.println(topo.getDado()+" foi retirado da pilha!");
 			topo = topo.getProx();
 			tamanho--;
 		}else {
 			System.out.println("Pilha está vazia!");
 		}
 	}
	@Override
	public Nodo getInicio() {
		// TODO Auto-generated method stub
		return null;
	}
}
