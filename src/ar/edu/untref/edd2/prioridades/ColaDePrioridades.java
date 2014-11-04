package ar.edu.untref.edd2.prioridades;

/**
 * Cola de Prioridades:
 * -------------------
 * 
 * Estructura din�mica de datos similar a una Cola.
 * 
 * Todo elemento est� asociado a una prioridad.
 *  
 * Los elementos se organizan seg�n prioridad y orden de llegada.
 * 
 * 
 * @param <T> Tipo de elemento que almacena la cola.
 */
public class ColaDePrioridades<T> {

    private Nodo<T> frente;
    
    private Nodo<T> fondo;
    
    /**
     * post: construye la instancia vac�a.
     */
    public ColaDePrioridades() {
     
        this.frente = null;
        this.fondo = null;
    }
    
    /**
     * @return si la cola est� o no vac�a.
     */
    public boolean estaVacia() {
        
        return (this.frente == null) && (this.fondo == null);
    }

    /**
     * pre : no est� vac�a.
     * post: 
     * 
     * @return elemento del frente de la cola.
     */
    public T frente() {
        
        if (this.estaVacia()) {
            
            throw new IllegalStateException("La cola est� vac�a");
        }
        
        return this.frente.getDato();
    }
    
    /**
     * post: agrega 'elemento' a la cola orden�ndolo de acuerdo 
     *       a su prioridad descendente y al orden de llegada.
     *  
     *  
     * @param prioridad
     * @param dato
     */
    public void acolar(int prioridad, T elemento) {
        
        // TODO Implementar
        
    }
    
    /**
     * pre : no est� vac�a.
     * post: retira el frente de la cola y lo devuelve.
     * 
     * @return elemento removido de la estructura.
     */
    public T desacolar() {
        
        // TODO Implementar
        
        return null;
    }
}
