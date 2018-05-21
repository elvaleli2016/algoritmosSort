/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Eliam
 */
public class ArbolBin<T> {
    
    private NodoBinario<T> head;

    public ArbolBin() {
    }
    
    public void insertNodo(T info){
        if(head==null)
            head=new NodoBinario(info);
        else{
            this.insert(info);
        }
    }

    private void insert(T info) {
        if(head==null)
            head=new NodoBinario(info);
        else head.insertar(info);
    }
    public void ordenar(String ord){
        switch(ord){
            case "preorden":    head.preOrden(head);break;
            case "postorden":   head.postOrden(head);break;
            case "inorden":     head.inOrden(head);
        }
    }
    public boolean buscar(T bus){
        if(head==null)return false;
        return head.buscar(head, bus);
    }
    
    
    
}
