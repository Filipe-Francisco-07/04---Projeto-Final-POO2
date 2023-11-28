package Listas;

import java.util.Stack;
/**
 * Classe da estrutura de dados Fila.
 */
public class Fila implements Lista{
	

	/**
	 *  @param inicio Parâmetro que utiliza a classe nodo e recebe marca o primeiro elemento presente na fila;
	 *  @param fim Parâmetro que utiliza a classe nodo e marca o último elemento presente na fila;
	 * @param limite Parâmetro inteiro que informa o número máximo de elementos que a fila poderá ter;
	 * @param tamanho Parâmetro do tipo inteiro que sinaliza o número de elementos da fila, sendo modificado após uma inserção ou remoção.
	 */
	
		private Nodo inicio = null;
		private Nodo fim;
		private int limite = 0;
		private int tamanho = 0;
		
		/**
		 * Construtor da fila, recebe como parâmetro o limite máximo de elementos.
		 * @param limite Parâmetro inteiro que informa o número máximo de elementos que a fila poderá ter;
		 */
		public Fila(int limite) {
			this.limite=limite;
		}
		/**
		 * Método estaVazio
		 * @return retorna verdadeiro se o tamanho for igual a 0 (sem elementos na Fila).
		 */
		
		public boolean estaVazio() {
			return tamanho == 0;
		}
		/**
		 * Método tem espaço;
		 * @return retorna verdadeiro se o limite for maior que o tamanho.
		 */
		public boolean temEspaco() {
			return limite > tamanho;
		}
		/**
		 * getInicio
		 * @return retorna o nodo de inicio se a fila não estiver vazia, caso contrário retorna nulo. 
		 */
		public Nodo getInicio() {
			if(!estaVazio()) {
				return inicio;
			}else {
				System.out.println("Fila está vazia!");
				return null;
			}
		}
		/**
		 * Método de inserção, adiciona um elemento à fila;
		 * @param dado recebe como parâmetro um inteiro que será adicionado à fila;
		 */
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
		/**
		 * Método de busca, procura por um valor dentro da fila;
		 * @return retorna true se o valor da busca for encontrado, caso contrário retorna false.
		 */
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
		/**
		 * Método de ordenação, ordena a fila por ordem crescente;
		 */
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
		/**
		 * Método de tamanho
		 * @return retorna o número de elementos da fila.
		 */
		public int tamanho() {
		    return tamanho;
		}

		@Override
		/**
		 * Método de cópia, realiza uma cópia da fila na qual o método foi utilizado;
		 * @return retorna um cópia do tipo Lista da fila.
		 */
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
		/**
		 * Método de inversão, inverte os elementos da fila;
		 */
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
		/**
		 * Método de remoção, remove um elemento;
		 * @param valor percorre a fila procurando se o valor à ser removido é igual ao valor atual, caso seja, será removido.
		 */
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
		/**
		 * Método de alteração, modifica um elemento;
		 * @param valorAntigo percorre a fila procurando se o valor à ser modificado é igual ao valor atual, caso seja, será alterado;
		 *@param novoValor modifica o valor que foi encontrado (valor da fila no qual é igual ao valorAntigo).
		 */
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
		/**
		 * Método de mostrar, retorna uma string com todos os elementos presentes na fila.
		 */
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
