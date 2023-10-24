package Listas;

public class ListaEncadeada implements Lista{

		private Nodo inicio;
		
		public ListaEncadeada() {
			inicio = null;
		}
		
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
		
		public void mostrar() {
			if(vazia()) {
				System.out.println("Null list. :(");
				return;
			}
			Nodo aux = inicio;
			while(aux != null) {
				System.out.print(aux.getDado()+" ");
				aux = aux.getProx();
			}
			System.out.println();
			
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
		
		public int buscarValor(int valor) {
			if(vazia()){
				return -1;
			}
		
			Nodo  aux = inicio;
			int posicao = 0;
			while(aux != null) {
				posicao++;
				if(aux.getDado()==valor) {
					return posicao;
				}
				aux = aux.getProx();
			}
			return-1;
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
