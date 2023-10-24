package Listas;

public class ListaCircular implements Lista{

		private Nodo inicio;
		private Nodo fim;
		
		public ListaCircular() {
			inicio = null;
		}
		
		public Nodo getInicio() {
			return inicio;
		}

		public Nodo getFim() {
			return fim;
		}
		
		public void inserirInicio(int dado) {
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
		
		public String mostrarLista() {
			String lista = "";
			if(inicio == null) return lista;
			Nodo aux = inicio;
			do {
				lista+= aux.getDado()+"\n";
				aux = aux.getProx();
			}while(aux!=inicio);
			return lista;
		
		}
		
		public void deleteComValor(int dado) {
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
		
		public void inserirFinal(int dado) {
			Nodo novoNodo = new Nodo(dado);
			if(inicio == null) {
				inicio = novoNodo;
			}else {
				fim.setProx(novoNodo);
				fim = novoNodo;
				novoNodo.setProx(inicio);
			}
			
		}
		
		public int buscarValor(int valor) {
			if(inicio == null) return -1;	
		
			Nodo aux = inicio;
			int posicao = 0;
			do {
				posicao++;
				if(aux.getDado()==valor) {
					return posicao;
				}
				aux = aux.getProx();
			}while(aux != inicio);
			return-1;
		}

		@Override
		public void inserir(int valor) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void remover(int valor) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mostrar() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void alterar(int valorAntigo, int novoValor) {
			// TODO Auto-generated method stub
			
		}

}
