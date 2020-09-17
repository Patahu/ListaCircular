/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author patro
 */
public class ListaCircular<Tipo> {
    private NodoCircular primero;
    
    private int longitud=0;
    public ListaCircular() {
        primero=null;
    }
    
    
    public ListaCircular insertarInicio(Tipo elemento){
        NodoCircular nuevo= new NodoCircular(elemento);
       if(primero!=null){
           NodoCircular aux=primero;
           while(aux.getSiguiente()!=primero){
               aux=aux.getSiguiente();

           }
         aux.setSiguiente(nuevo);
         nuevo.setSiguiente(primero);
       }
       
       primero=nuevo;
       longitud++;
        
        return this;
    }
    
    //  Funcion para buscar un elemento mediante la posicion
    public Tipo buscarElemento(int n){
        if(primero==null){
            return null;
            
        }else{
         Tipo elementoBuscado;
         NodoCircular puntero= primero;
         int contador=0;
         while(contador<n && puntero.getSiguiente()!=primero){
                puntero=puntero.getSiguiente();
                contador++;
            }
            if(contador!=n){
                return null;
            }else{
                return (Tipo) puntero.getDato();
             }
        }
    } 
    
    public ListaCircular insertarFinal(Tipo elemento){
     
        NodoCircular nuevo=new NodoCircular(elemento);
        if(primero==null){
            primero=nuevo;
        }else{
            NodoCircular aux=primero;
            while(aux.getSiguiente()!=primero){
                aux=aux.getSiguiente();
            }
            
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            
        }
        longitud++;
        return this;
        
    }
    
    public String visualizar(){
        String salida="";
        if(primero!=null){
            NodoCircular aux=primero;
            do{
                salida=salida+"["+aux.getDato()+"]->";
                aux=aux.getSiguiente();
            } while(aux!=primero);
        }
        return "Elemenos de la lista circular :"+salida;
    }
    
    public ListaCircular eliminarInicio(){
        
        if(primero!=null){
            if(primero.getSiguiente()!=primero){
                NodoCircular aux=primero;
                while(aux.getSiguiente()!=primero){
                    aux=aux.getSiguiente();
                }
                aux.setSiguiente(primero.getSiguiente());
                primero.setSiguiente(null);
                primero=aux.getSiguiente();
                longitud--;
            }
        }else{
            primero=null;
            
        }
        return this;
    
    }
    
    public ListaCircular eliminarFinal(){
        if(primero!=null){
            if(primero.getSiguiente()!=primero){
                NodoCircular aux=primero;
                while(aux.getSiguiente().getSiguiente()!=primero){
                    aux=aux.getSiguiente();
                 
                }
                aux.getSiguiente().setSiguiente(aux.getSiguiente());
                aux.setSiguiente(primero);
                longitud--;
            }
        }else{
            primero=null;
        }
        return this;
    }
    public int longitud(){
        return longitud;
    }
}
