package Listas;
/**
 * Classe ListaFactory, classe que vai gerar a lista desejada;
 * 
 * @author filipefranciscof3@gmail.com
 */
public class ListaFactory {

    /**
     * Metodo createLista, retorna a lista conforme o tipo passado pelo usuário.
     * Tipos disponiveis: encadeada, duplamenteEncadeada e circular.
     *
     * @param tipo Tipo de lista desejada.
     * 
     * @return Instancia da lista desejada.
     * 
     * @throws IllegalArgumentException Se o tipo de lista for invalido.
     */
    public Lista createLista(String tipo) {
        if (tipo.equals("encadeada")) {
            return new ListaEncadeada();
        } else if (tipo.equals("duplamenteEncadeada")) {
            return new ListaDuplamenteEncadeada();
        } else if (tipo.equals("circular")) {
            return new ListaCircular();
        } else {
            throw new IllegalArgumentException("Tipo de lista inválido");
        }
    }

    /**
     * Metodo createLista, retorna a lista conforme o tipo passado pelo usuário e o limite especificado.
     * Tipos disponiveis: fila e pilha.
     *
     * @param tipo   Tipo de lista desejada.
     * 
     * @param limite Limite de tamanho da lista.
     * 
     * @return Instancia da lista desejada.
     * 
     * @throws IllegalArgumentException Se o tipo de lista for inválido.
     */
    public Lista createLista(String tipo, int limite) {
        if (tipo.equals("fila")) {
            return new Fila(limite);
        } else if (tipo.equals("pilha")) {
            return new Pilha(limite);
        } else {
            throw new IllegalArgumentException("Tipo de lista inválido");
        }
    }
}