public interface List<E> {
    //interfaz para la opcion de trabajar con listas
    void addFirst(E item);
    void addLast(E item);
    E removeFirst();
    E removeLast();
    E getFirst();
    E getLast();
    boolean isEmpty();
}
