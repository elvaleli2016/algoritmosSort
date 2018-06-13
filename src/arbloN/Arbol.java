/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbloN;

import Lista.Lista;


/**
 *
 * @author Eliam
 */
public class Arbol {
    
    private NodoEneario raiz;
    private int longitud;
    public int cant;

    public Arbol(int longitud) {
        this.longitud=longitud;
        raiz=new NodoEneario(0, longitud);
    }
    /**
     * Metodo crear los adoquines
     * @param cant 
     */
    public void adoquines(int cant){
        adoquinesSinTree(cant);
        //this.adoquines(raiz, cant);
    }
    private void adoquines(NodoEneario n,int cant){
        for(int i=0;i<longitud;i++){
            if( (cant)==0 )return;
            adoquines(n.insertarRama(i+1),--cant);
        }
    }
    
    private void adoquinesSinTree(int cant){
        if(cant==0){
            this.cant++;
            return;
        }
        int i=0;
        do{
            adoquinesSinTree(--cant);
            i++;
        }while(i<longitud&&cant!=0);
        
    }
    /**
     * Metodo que obtine cantidad caminos tiene el arbol
     * @return caminos
     */
    public int caminos(){
        return this.hojas(raiz);
    }
    
    private int hojas(NodoEneario n){
        if(n==null)return 0;
        if(n.estado==0)return 1;
        int cant=0;
        for(int i=0;i<n.estado;i++){
            cant+=hojas(n.hijo[i]);
        }
        return cant;
    }
    /**
     * Metodo que imprime todos los caminos
     */
    public void  imprimirCaminos(){
        this.imprimirCaminos(raiz,new Lista<Integer>());
    }
    
    private void imprimirCaminos(NodoEneario n,Lista l){
        if(n==null)return;
        if(n.info!=0)//Par que no insete en la lista de impresion la cabeza
            l.insert(n.info);
        if(n.estado==0){
            l.imprimirLista();
        }
        int cant=0;
        for(int i=0;i<n.estado;i++){
            
            this.imprimirCaminos(n.hijo[i],l);
        }
        l.eliminarCola();
        
    }
       
}
