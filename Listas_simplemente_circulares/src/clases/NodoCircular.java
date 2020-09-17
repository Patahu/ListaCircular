
package clases;

public class NodoCircular<Tipo> {
    private Tipo dato;
    private NodoCircular siguiente;

    public NodoCircular(Tipo dato) {
        this.dato = dato;
        this.siguiente=this;
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
