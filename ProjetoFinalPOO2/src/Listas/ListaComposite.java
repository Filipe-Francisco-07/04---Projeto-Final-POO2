package Listas;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe ListaComposite: Permite fazer a composicao de varias listas, manipulando todas elas juntas.
 */
public class ListaComposite implements Lista {

    private List<Lista> listas;
    /**
     * Construtor da ListaComposite
     */
    public ListaComposite() {
        this.listas = new ArrayList<>();
    }
    /**
     * Metodo adicionarLista: adiciona uma Lista na lista de listas.
     * 
     * @param lista O parametro e um tipo lista, que sera adicionado na lista de listas;
     */
    public void adicionarLista(Lista lista) {
        listas.add(lista);
    }
    /**
     * Metodo removerLista: remove uma Lista na lista de listas.
     * 
     * @param lista O parametro e um tipo lista, que sera removido da lista de listas;
     */
    public void removerLista(Lista lista) {
        listas.remove(lista);
    }

    @Override
    public void inserir(int valor) {
        for (Lista lista : listas) {
            lista.inserir(valor);
        }
    }

    @Override
    public void remover(int valor) {
        for (Lista lista : listas) {
            lista.remover(valor);
        }
    }

    @Override
    public void alterar(int valorAntigo, int novoValor) {
        for (Lista lista : listas) {
            lista.alterar(valorAntigo, novoValor);
        }
    }

    @Override
    public boolean buscar(int valor) {
        for (Lista lista : listas) {
            if (lista.buscar(valor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String mostrar() {
        StringBuilder result = new StringBuilder();
        for (Lista lista : listas) {
            result.append(lista.mostrar()).append("\n");
        }
        return result.toString();
    }

    @Override
    public void ordenar() {
        for (Lista lista : listas) {
            lista.ordenar();
        }
    }

    @Override
    public int tamanho() {
        int size = 0;
        for (Lista lista : listas) {
            size += lista.tamanho();
        }
        return size;
    }

    @Override
    public Lista copiar() {
        ListaComposite copia = new ListaComposite();
        for (Lista lista : listas) {
            copia.listas.add(lista.copiar());
        }
        return copia;
    }

    @Override
    public void inverter() {
        for (Lista lista : listas) {
            lista.inverter();
        }
    }

    @Override
    public Nodo getInicio() {
        if (!listas.isEmpty()) {
            return listas.get(0).getInicio();
        }
        return null;
    }
}
