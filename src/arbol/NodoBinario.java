/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.Objects;

/**
 *
 * @author Eliam
 */
public class NodoBinario <T> {
    private T info;
    private NodoBinario<T> der;
    private NodoBinario<T> izq;

    public NodoBinario(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    /**
     * Insertar en el arbol
     * @param elem 
     */
    public void insertar(T elem){
        if(this.compareTo(elem)<=0){
            if (izq == null)
                izq = new NodoBinario(elem);
            else
                izq.insertar(elem);
        }
        else{
            if (der == null)
                der = new NodoBinario(elem);
            else
                der.insertar(elem);
        }
    }
    
    /**
     * Preorden Recursivo del arbol
     * @param n 
     */
    public void preOrden (NodoBinario n){
        if(n == null)
                return;
        else{
            System.out.print (n.info + " ");
            preOrden (n.izq);
            preOrden (n.der);
        }
    }

    /**
     * PostOrden recursivo del arbol
     * @param n 
     */
    public void postOrden (NodoBinario n){
        if(n == null)
            return;
        else{
            postOrden (n.izq);
            postOrden (n.der);
            System.out.print (n.info + " ");
        }
    }
    
    /**
     * Inorden Recursivo del arbol
     * @param n 
     */
    public void inOrden (NodoBinario n){	
        if(n == null)
            return;
        else{
            inOrden (n.izq);
            System.out.print(n.info + " ");
            inOrden (n.der);
        }
    }
    
    /**
     * Cantidad de Niveles que posee el arbol
     * @param n
     * @return 
     */
    public int altura (NodoBinario n){ 
            if (n==null)
             return -1;
        else
             return 1+Math.max(altura(n.izq),altura(n.der));
    }
    
    /**
     * Maximo tamaño del arbol
     * @param n
     * @return 
     */ 
    public int tamaño (NodoBinario n){
        if (n==null)
           return 0;
        else
          return 1+tamaño(n.izq)+tamaño(n.der);
    }
    
    public boolean buscar(NodoBinario n,T bus){
        if(n==null)
            return false;
        if(this.compareTo(bus)==0)
            return true;
        if(this.compareTo(bus)==-1){
            return buscar(n.izq,bus);
        }
        return buscar(n.der,bus);
    }
    
    public int compareTo(T comparar){
        int i=0;
        if(info instanceof Integer){
            int inf=(Integer)info;
            int comp=(Integer)comparar; 
            if(inf<comp)i=-1;
            else if(inf>comp)i=1;
        }
        return i;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.info);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodoBinario<?> other = (NodoBinario<?>) obj;
        if (!Objects.equals(this.info, other.info)) {
            return false;
        }
        return true;
    }
    
}
    

