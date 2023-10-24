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
		    System.out.println("Método de alterar não suportado em pilhas.");
		}

		public void mostrar() {
		    System.out.println("Método de mostrar não suportado em pilhas.");
		}
}
