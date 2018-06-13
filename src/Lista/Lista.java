/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Eliam
 */
public class Lista <T>{
    NodoLista<T> cab;
    NodoLista<T> cola;
    public void insert(T dato){
        if(cab==null){
            cab=new NodoLista<T>(dato);
            cola=cab;
        }else{
            cola.sig=new NodoLista<T>(dato);
            cola.sig.ant=cola;
            cola=cola.sig;
        }
        
    }
    
    public T eliminarCola(){
        T regre;
        if(cola==null)return null;
        regre=cola.info;
        if(cola==cab)
            cola=cab=null;
        else{
            cola=cola.ant;
            cola.sig=null;
        }
        return regre;
    }
    
    public void imprimirLista(){
        System.out.println("");
        this.imprimirLista(cab);
    }
    
    private void imprimirLista(NodoLista n){
        if(n==null)return;
        System.out.print("->"+n.info);
        this.imprimirLista(n.sig);
    }
}
