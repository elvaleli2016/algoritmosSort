/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import algoritmos.ordenamiento.Sort;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Eliam
 */
public class Fachada {
    
    private int longitud;
    private int[] array;
    private int numMax;
    private Sort sorts;
    /**
     * Constructor de Fachada
     * @param longitud 
     * @param numMax 
     */
    public Fachada(int longitud, int numMax) {
        this.refrescar(longitud, numMax);
    }
    
    public void refrescar(int longitud, int numMax) {
        this.longitud = longitud;
        this.numMax = numMax;
        this.generarArray();
        this.sorts=new Sort();
    }
    
    private void generarArray(){
        try{
            array=new int[longitud];
            for(int i=0;i<longitud;i++){
                array[i] = 1 + (int)(Math.random() * numMax);
            }
            System.out.println("Se ha creado el array de "+longitud+" posiciones");
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }catch(OutOfMemoryError e){
            System.out.println("Desborde de memoria");
        }
    }
    /**
     * Metodo
     * @return 
     */
    public String ordenarBy(String orden){
        try{
            sorts.inicio();
            switch(orden){
                case "burbuja":         sorts.burbuja(array)        ;break;
                case "insertionSort":   sorts.insertionSort(array)  ;break;
                case "mergeSort":       sorts.mergeSort(array)      ;break;
                case "quickSort":       sorts.quickSort(array)      ;break;
                case "headSort":        sorts.headSort(array)       ;break;
                case "radixSort":       sorts.radixSort(array)      ;break;
                case "shellSort":       sorts.shellSort(array)      ;break;
            }
            return orden+ "\n" + sorts.fin() +"\n";
        }catch(Exception e){
            System.out.print("Ha ocurrido un error "+e.toString());
            return "";
        }
    }
    
    
    
}
