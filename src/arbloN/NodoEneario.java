/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbloN;

/**
 *
 * @author Eliam
 */
public class NodoEneario {
    int info;
    NodoEneario[] hijo;
    int longitud;
    int estado;

    public NodoEneario(int info, int longitud) {
        this.longitud=longitud;
        this.info = info;
        hijo=new NodoEneario[longitud];
    }
    
    public NodoEneario insertarRama(int rama){
        if(estado==longitud)return null;
        hijo[estado]=new NodoEneario(rama, longitud);
        return hijo[estado++];
    }
    
    
}
