package Listas;

public interface Lista {
    void inserir(int valor);
    void remover(int valor);
    void alterar(int valorAntigo, int novoValor);
    void mostrar();
}