package Listas;

public class Pilha implements Lista{

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


	public void remover(int valor) {
	    if (!estaVazio()) {
	        if (topo.getDado() == valor) {
	            System.out.println(valor + " foi retirado da pilha!");
	            topo = topo.getProx();
	            tamanho--;
	        } else {
	            System.out.println(valor + " não encontrado na pilha!");
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
	            resultado.append(aux.getDado()).append(" ");
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

        int[] array = new int[tamanho];
        Nodo aux = topo;
        int i = 0;

        while (aux != null) {
            array[i] = aux.getDado();
            aux = aux.getProx();
            i++;
        }

        for (i = 0; i < tamanho - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (array[j] < array[menorIndex]) {
                    menorIndex = j;
                }
            }

            int temp = array[menorIndex];
            array[menorIndex] = array[i];
            array[i] = temp;
        }

        while (!estaVazio()) {
            remover(getTopo());
        }
        for (i = 0; i < tamanho; i++) {
            inserir(array[i]);
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
