package arbol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eliam Zapata
 */
public class NodoB<T> {

    T info;
    NodoB izq, der;
    //Constructores

    NodoB(T elem) {
        info = elem;
        NodoB izq, der = null;
    }

    NodoB() {
        NodoB izq, der = null;
    }

    public void insertar(T elem) {
        if (compareTo(elem) >= 0) {
            if (izq == null) {
                izq = new NodoB(elem);
            } else {
                izq.insertar(elem);
            }
        } else {
            if (compareTo(elem) == -1) {
                if (der == null) {
                    der = new NodoB(elem);
                } else {
                    der.insertar(elem);
                }
            }
        }
    }

    /**
     * Metodod compara 1 mayor que el,0 igual -1 menor
     *
     * @param comparar
     * @return
     */
    public int compareTo(T comparar) {
        int i = 0;
        if (info instanceof Integer) {
            int inf = (Integer) info;
            int comp = (Integer) comparar;
            if (inf < comp) {
                i = -1;
            } else if (inf > comp) {
                i = 1;
            }
        }
        return i;
    }

}
