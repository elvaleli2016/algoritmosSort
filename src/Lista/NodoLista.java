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
public class NodoLista<T> {
    T info;
    NodoLista sig;
    NodoLista ant;

    public NodoLista(T info) {
        this.info = info;
    }
    
    
}
