/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import algoritmos.ordenamiento.InsertionSort;
import algoritmos.ordenamiento.MergeSoft;
import algoritmos.ordenamiento.QuickSort;
import algoritmos.ordenamiento.QuickSort2;
import algoritmos.ordenamiento.Sort;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Eliam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sort sort=new Sort();
        
        int longitud=10000000;
        int[] array=new int[longitud];
        Random r = new Random();
        for(int i=0;i<longitud;i++){
            array[i] = 1 + (int)(Math.random() * 999999);
        }
        
//        sort.inicio();
//        sort.burbuja(array);
//        sort.fin();
//        
//        sort.inicio();
//        sort.insertionSort(array);
//        sort.fin();
        
        sort.inicio();
        sort.mergeSort(array);
        sort.fin();
        
        sort.inicio();
        sort.quickSort(array);
        sort.fin();
    }
    
}
