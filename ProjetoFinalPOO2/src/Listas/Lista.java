package Listas;

public interface Lista {
    void inserir(int valor);
    void remover(int valor);
    void alterar(int valorAntigo, int novoValor);
    boolean buscar(int valor);
    String mostrar();
    void ordenar();
    int tamanho();
    Lista copiar();
    void inverter();
    public Nodo getInicio();
}