package ar.edu.untref.edd2.prioridades;

/**
 * Nodo doblemente enlazado con prioridad.
 *
 * @param <T> Tipo de dato que el Nodo almacena.
 */
public class Nodo<T> {

    private T dato;
    
    private int prioridad;
    
    private Nodo<T> anterior;
    
    private Nodo<T> siguiente;
    
    public Nodo(int prioridad, T dato) {
     
        this.prioridad = prioridad;
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public int getPrioridad() {
    
        return this.prioridad;
    }
    
    public T getDato() {
        
        return this.dato;
    }
    
    public void setDato(T dato) {
        
        this.dato = dato;
    }
    
    public Nodo<T> getAnterior() {
        
        return this.anterior;
    }
    
    public void setAnterior(Nodo<T> anterior) {
        
        this.anterior = anterior;
    }
    
    public Nodo<T> getSiguiente() {
        
        return this.siguiente;
    }
    
    public void setSiguiente(Nodo<T> siguiente) {
        
        this.siguiente = siguiente;
    }
}
