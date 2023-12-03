package Listas;

public class ListaFacade {
    private Lista lista;

    public ListaFacade(Lista lista) {
        this.lista = lista;
    }
    /**
	 * Metodo de insercao, adiciona um elemento a lista;
	 * @param valor recebe como parametro um inteiro que sera adicionado a lista;
	 */
    public void inserir(int valor) {
        lista.inserir(valor);
    }
    /**
   	 * Metodo de remocao, remove um elemento;
   	 * @param valor percorre a lista procurando se o valor a ser removido e igual ao valor atual, caso seja, sera removido.
   	 */
    public void remover(int valor) {
        lista.remover(valor);
    }
    /**
	 * Metodo de alteracao, modifica um elemento;
	 *@param valorAntigo percorre a fila procurando se o valor a ser modificado e igual ao valor atual, caso seja, sera alterado pelo novoValor;
	 *@param novoValor modifica o valor que foi encontrado (valor da fila no qual e igual ao valorAntigo).
	 */
    public void alterar(int valorAntigo, int novoValor) {
        lista.alterar(valorAntigo,novoValor);
    }
    /**
	 * Metodo de busca, procura por um valor dentro da lista;
	 * @param requer como parametro de entrara o valor que sera procurado dentro da lista;
	 * @return retorna true se o valor da busca for encontrado, caso contrario retorna false.
	 */
    public void buscar(int valor) {
        lista.buscar(valor);
    } 
    /**
	 * Metodo de mostrar;
	 * @return retorna uma string com todos os elementos presentes na lista.
	 */
    public String mostrar() {
        return lista.mostrar();
    }
    /**
  	 * Metodo de ordenacao, ordena a lista por ordem crescente;
  	 */
    public void ordenar() {
        lista.ordenar();
    }
    /**
   	 * Metodo de tamanho
   	 * @return retorna o numero de elementos presentes na lista.
   	 */
    public int tamanho() {
       return lista.tamanho();
    }
    /**
   	 * Metodo de copia, realiza uma copia da lista na qual o metodo foi utilizado;
   	 * @return retorna uma copia do tipo Lista.
   	 */
    public Lista copiar() {
        return lista.copiar();
    }
    /**
   	 * Metodo de inverter, realiza a inversao dos elementos da lista;
   	 */
    public void inverter() {
        lista.inverter();
    }
    /**
   	 * Metodo getInicio
   	 * @return retorna o nodo de inicio se a lista não estiver vazia, caso contrário retornara nulo. 
   	 */
    public Nodo getInicio() {
        return lista.getInicio();
    }
}
