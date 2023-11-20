package Listas;

import java.util.Stack;

public class Fila implements Lista{

		private Nodo inicio = null;
		private Nodo fim;
		private int limite = 0;
		private int tamanho = 0;
		
		public Fila(int limite) {
			this.limite=limite;
		}
		public boolean estaVazio() {
			return tamanho == 0;
		}
		public boolean temEspaco() {
			return limite > tamanho;
		}
		public Nodo getInicio() {
			if(!estaVazio()) {
				return inicio;
			}else {
				System.out.println("Fila está vazia!");
				return null;
			}
		}
		public void inserir(int dado) {
			if(temEspaco()) {
				Nodo novo = new Nodo(dado);
				if(estaVazio()) {
					inicio = novo;
					fim = novo;
				}else {
					fim.setProx(novo);
					fim = novo;
				}
				tamanho++;
			}else {
				System.out.println("Fila cheia!");
			}
		}
		public Integer remover() {
			if(estaVazio()) {
				return null;
			}
			int valor = inicio.getDado();
			inicio = inicio.getProx();
			tamanho--;
			if(estaVazio()) {
				fim = null;
			}
			return valor;
		}
		
		public void separaFila(Fila F,Fila F_Par,Fila F_Impar) {
			
			while(!F.estaVazio()) {
				int num = F.remover();
				if(num % 2 == 0) {
					F_Par.inserir(num);
				}else {
					F_Impar.inserir(num);
				}
		
			}
			
		}

		@Override
		public boolean buscar(int valor) {
			Nodo atual = inicio;
		    while (atual != null) {
		        if (atual.getDado() == valor) {
		            return true;
		        }
		        atual = atual.getProx();
		    }
		    return false;
		}

		@Override
		public void ordenar() {
		    Nodo atual, proximo;
		    boolean trocou;
		    do {
		        trocou = false;
		        atual = inicio;
		        while (atual != null && atual.getProx() != null) {
		            proximo = atual.getProx();
		            if (atual.getDado() > proximo.getDado()) {
		                int temp = atual.getDado();
		                atual.setDado(proximo.getDado());
		                proximo.setDado(temp);
		                trocou = true;
		            }
		            atual = atual.getProx();
		        }
		    } while (trocou);
		}

		@Override
		public int tamanho() {
		    return tamanho;
		}

		@Override
		public Lista copiar() {
		    Fila copia = new Fila(limite);
		    Nodo atual = inicio;
		    while (atual != null) {
		        copia.inserir(atual.getDado());
		        atual = atual.getProx();
		    }
		    return copia;
		}

		@Override
		public void inverter() {
		    Stack<Integer> pilha = new Stack<>();
		    Nodo atual = inicio;
		    while (atual != null) {
		        pilha.push(atual.getDado());
		        atual = atual.getProx();
		    }
		    atual = inicio;
		    while (!pilha.isEmpty()) {
		        atual.setDado(pilha.pop());
		        atual = atual.getProx();
		    }
		}

		@Override
		public void remover(int valor) {
		    Nodo atual = inicio;
		    Nodo anterior = null;

		    while (atual != null) {
		        if (atual.getDado() == valor) {
		            if (anterior == null) {
		                inicio = atual.getProx();
		            } else {
		                anterior.setProx(atual.getProx());
		            }
		            tamanho--;
		            if (atual == fim) {
		                fim = anterior;
		            }
		        } else {
		        	anterior = atual;
		        }
		        atual = atual.getProx();
		    }
		}

		@Override
		public void alterar(int valorAntigo, int novoValor) {
		    Nodo atual = inicio;
		    while (atual != null) {
		        if (atual.getDado() == valorAntigo) {
		            atual.setDado(novoValor);
		        }
		        atual = atual.getProx();
		    }
		}

		@Override
		public String mostrar() {
		    StringBuilder resultado = new StringBuilder();

		    Nodo atual = inicio;
		    while (atual != null) {
		        resultado.append(atual.getDado()).append(" ");
		        atual = atual.getProx();
		    }

		    return resultado.toString();
		}
}
