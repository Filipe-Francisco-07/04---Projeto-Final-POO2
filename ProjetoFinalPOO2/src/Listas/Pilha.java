package Listas;

/**
  Classe da estrutura de dados Pilha;
* @author filipefranciscof3@gmail.com
*/

public class Pilha implements Lista{

	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	/**
	  Construtor da estrutura de dados Pilha;
	* @param limite Define o numero maximo de elementos que a pilha tera;
	*/
	public Pilha(int limite) {
		this.limite=limite;
	}
	/**
	 * Metodo getTopo;
	* @return retorna o topo da pilha.
	*/
	public int getTopo() {
		return topo.getDado();
	}
	/**
	 * Metodo estaVazio;
	* @return retorna verdadeiro se o tamanho da pilha for igual a zero.
	*/
	public boolean estaVazio() {
		return tamanho == 0;
	}
	/**
	 * Metodo temEspaco;
	* @return retorna verdadeiro enquanto o limite for maior que o tamanho.
	*/
	public boolean temEspaco() {
		return limite > tamanho;
	}
	@Override
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
	@Override
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

	@Override
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
	@Override
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
	@Override
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
    public Pilha copiar() {
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
 	
	@Override
	public Nodo getInicio() {
		// TODO Auto-generated method stub
		return null;
	}
}
