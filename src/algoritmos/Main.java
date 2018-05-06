/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import algoritmos.ordenamiento.MergeSoft;
import algoritmos.ordenamiento.QuickSort;
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
        Date data1,data2;
        Main main=new Main();
        int longitud=50;
        int[] array=new int[longitud];
        Random r = new Random();
        for(int i=0;i<longitud;i++){
            array[i] = 1 + (int)(Math.random() * 9999999);
        }
        
       
        int[] B;
        
        B=main.copia(array);
        data1 = new Date();
        System.out.println(data1);
        QuickSort q=new QuickSort( B );
        data2=new Date();
        System.out.println(data2+" diferencia:"+ ((data2.getTime()-data1.getTime())/60));
        main.imprimirArray(B);
        
        B=main.copia(array);
        data1 = new Date();
        System.out.println(data1);
        MergeSoft m=new MergeSoft( B );
        data2=new Date();
        System.out.println(data2+" diferencia:"+ ((data2.getTime()-data1.getTime())/60));
        main.imprimirArray(B);
        
        
    }
    
    public void imprimirArray(int[] A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
    
    public int[] copia(int[] array){
        int [] a=new int [array.length];
        for(int i=0;i<array.length;i++){
            a[i]=array[i];
        }
        return a;
    }
    
}
