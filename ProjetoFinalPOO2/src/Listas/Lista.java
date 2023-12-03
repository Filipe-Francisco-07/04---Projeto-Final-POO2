package Listas;
/**
 * Interface Lista: tem todos os metodos que vao ser implementados por varios tipos de listas.
 * @author filipefranciscof3@gmail.com
 */

public interface Lista {
	/**
	 * Metodo de insercao, adiciona um elemento a lista;
	 * @param valor recebe como parametro um inteiro que sera adicionado a lista;
	 */
    void inserir(int valor);
    /**
	 * Metodo de remocao, remove um elemento;
	 * @param valor percorre a lista procurando se o valor a ser removido e igual ao valor atual, caso seja, sera removido.
	 */
    void remover(int valor);
    /**
	 * Metodo de alteracao, modifica um elemento;
	 *@param valorAntigo percorre a fila procurando se o valor a ser modificado e igual ao valor atual, caso seja, sera alterado pelo novoValor;
	 *@param novoValor modifica o valor que foi encontrado (valor da fila no qual e igual ao valorAntigo).
	 */
    void alterar(int valorAntigo, int novoValor);
	/**
	 * Metodo de busca, procura por um valor dentro da lista;
	 * @param requer como parametro de entrara o valor que sera procurado dentro da lista;
	 * @return retorna true se o valor da busca for encontrado, caso contrario retorna false.
	 */
    boolean buscar(int valor);
    /**
	 * Metodo de mostrar;
	 * @return retorna uma string com todos os elementos presentes na lista.
	 */
    String mostrar();
    /**
	 * Metodo de ordenacao, ordena a lista por ordem crescente;
	 */
    void ordenar();
    /**
	 * Metodo de tamanho
	 * @return retorna o numero de elementos presentes na lista.
	 */
    int tamanho();
    /**
	 * Metodo de copia, realiza uma copia da lista na qual o metodo foi utilizado;
	 * @return retorna uma copia do tipo Lista.
	 */
    Lista copiar();
    /**
	 * Metodo de inverter, realiza a inversao dos elementos da lista;
	 */
    void inverter();
    /**
	 * Metodo getInicio
	 * @return retorna o nodo de inicio se a lista não estiver vazia, caso contrário retornara nulo. 
	 */
    public Nodo getInicio();
}