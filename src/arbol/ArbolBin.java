package arbol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliam Zapata
 */
public class ArbolBin<T> {

    NodoB raiz;
    private int [] array;
    int longitud;

    //Constructor
    public ArbolBin() {
        raiz = null;
    }

    //Insercion de un elemento en el arbol
    public void insertaNodo(T elem) {
        if (raiz == null) {
            raiz = new NodoB<T>(elem);
        } else {
            raiz.insertar(elem);
        }
    }
    
    public int[] ordenar(int longitud){
        this.array=new int[longitud];
        return inOrdenArray(raiz);
        
    }

    //Preorden Recursivo del arbol
    public void preOrden(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            System.out.print(Nodo.info + " ");
            preOrden(Nodo.izq);
            preOrden(Nodo.der);
        }
    }

    //PostOrden recursivo del arbol
    public void postOrden(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            postOrden(Nodo.izq);
            postOrden(Nodo.der);
            System.out.print(Nodo.info + " ");
        }
    }

    //Inorden Recursivo del arbol
    public int[] inOrdenArray(NodoB Nodo) {
        if (Nodo == null) {
            return null;
        } else {
            inOrdenArray(Nodo.izq);
            array[longitud]=(int) Nodo.info;
            inOrdenArray(Nodo.der);
        }
        longitud++;
        return array;
    }

    //cantidad de niveles q	ue posee el arbol
    public int altura(NodoB Nodo) {
        if (Nodo == null) {
            return -1;
        } else {
            return 1 + Math.max(altura(Nodo.izq), altura(Nodo.der));
        }
    }

    //cantidad de elementos que posee el arbol	
    public int tamaño(NodoB Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + tamaño(Nodo.izq) + tamaño(Nodo.der);
        }
    }
    
    public boolean buscar(T elem){
        return buscar(elem,raiz);
    }
    /**
     * Metodo buscar si existe
     * @param elem
     * @param A
     * @return 
     */
    public boolean buscar(T elem, NodoB A) {
        if (A == null)
            return false;
        if(A.compareTo(elem)==0) {
            return true;
        } else {
            if (A.compareTo(elem)==1) {
                return buscar(elem, A.der);
            } else {
                return buscar(elem, A.izq);
            }
        }
    }
    
    /**
     * Metodo encontrar Nodo
     * @param elem
     * @param A
     * @return 
     */
    public NodoB buscarNodo(T elem, NodoB A) {
        if (A == null)
            return null;
        if(A.compareTo(elem)==0) {
            return A;
        } else {
            if (A.compareTo(elem)==1) {
                return buscarNodo(elem, A.der);
            } else {
                return buscarNodo(elem, A.izq);
            }
        }
    }
    
}
