package Listas;

/**
 * Classe da estrutura de dados Lista Circular.
 * @author filipefranciscof3@gmail.com
 * 
 * @param inicio Parâmetro que utiliza a classe nodo e marca o primeiro elemento presente na fila;
 * @param fim Parâmetro que utiliza a classe nodo e marca o último elemento presente na fila;
 */
public class ListaCircular implements Lista{

		private Nodo inicio;
		private Nodo fim;
		/**
		 * Construtor da lista circular.
		 */
		public ListaCircular() {
			inicio = null;
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
		
		public void inserir(int dado) {
			Nodo novoNodo = new Nodo(dado);
			if(inicio == null) {
				inicio = novoNodo;
				inicio.setProx(inicio);
				fim = inicio;
			}else {
				novoNodo.setProx(inicio);
				inicio = novoNodo;
				fim.setProx(inicio);
			}
		}
		
		public String mostrar() {
			String lista = "";
			if(inicio == null) return lista;
			Nodo aux = inicio;
			do {
				lista+= aux.getDado()+"\n";
				aux = aux.getProx();
			}while(aux!=inicio);
			
			return lista;
		
		}
		
		public void remover(int dado) {
			if(inicio == null) return;	
		
			if(inicio.getDado()== dado) {
				if(inicio == fim) {
					inicio = null; 
					return;
				}
				inicio = inicio.getProx();
				fim.setProx(inicio);
				return;
			}
			Nodo aux = inicio;
			do {
				if(aux.getProx().getDado()==dado) {
					aux.setProx(aux.getProx().getProx());
					return;
				}
				aux = aux.getProx();
			}while(aux != inicio);
			
			     
		}
		
		public void contaDados() {
			if(inicio == null) {
				System.out.println("0");	
			}
			int i = 0;
			Nodo aux = inicio;
			
			do {
				aux = aux.getProx();
				i++;
			}while(aux != inicio);
				
			System.out.println(i);	
		}
		
		public boolean buscar(int valor) {
			if(inicio == null) return false;	
		
			Nodo aux = inicio;
			do {
				if(aux.getDado()==valor) {
					return true;
				}
				aux = aux.getProx();
			}while(aux != inicio);
			return false;
		}




		public void alterar(int valorAntigo, int novoValor) {
		    if (inicio == null) return;
		    Nodo aux = inicio;
		    do {
		        if (aux.getDado() == valorAntigo) {
		            aux.setDado(novoValor);
		        }
		        aux = aux.getProx();
		    } while (aux != inicio);
		}

		@Override
		public void ordenar() {
		    if (inicio == null || inicio.getProx() == inicio) {
		        return; 
		    }
		    Nodo atual = inicio;
		    do {
		        Nodo proximo = atual.getProx();
		        do {
		            if (atual.getDado() > proximo.getDado()) {
		                int temp = atual.getDado();
		                atual.setDado(proximo.getDado());
		                proximo.setDado(temp);
		            }
		            proximo = proximo.getProx();
		        } while (proximo != inicio);
		        atual = atual.getProx();
		    } while (atual.getProx() != inicio);
		}

		@Override
		public int tamanho() {
		    if (inicio == null) return 0;
		    int tamanho = 0;
		    Nodo aux = inicio;
		    do {
		        tamanho++;
		        aux = aux.getProx();
		    } while (aux != inicio);
		    return tamanho;
		}

		@Override
		public ListaCircular copiar() {
		    ListaCircular copia = new ListaCircular();
		    Nodo aux = inicio;
		    Nodo novoInicio = null;

		    do {
		        copia.inserir(aux.getDado());
		        if (novoInicio == null) {
		            novoInicio = copia.getFim();
		        }
		        aux = aux.getProx();
		    } while (aux != inicio);

		    copia.setInicio(novoInicio);
		    return copia;
		}

		@Override
		public void inverter() {
		    if (inicio == null || inicio.getProx() == inicio) {
		        return; 
		    }
		    Nodo anterior = null;
		    Nodo atual = inicio;
		    Nodo proximo;
		    do {
		        proximo = atual.getProx();
		        atual.setProx(anterior);
		        anterior = atual;
		        atual = proximo;
		    } while (atual != inicio);

		    inicio = anterior;
		    fim = atual;
		    fim.setProx(inicio);
		}
}
