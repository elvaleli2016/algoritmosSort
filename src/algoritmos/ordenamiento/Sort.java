/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Eliam
 */
public class Sort {
    private int[] A;
    private Date inicio;
    private Date fin;
    /**
     * Metodo Burbuja 1
     */
    public void burbuja(int [] array){
        this.copia(array);
        imprimir("Metodo burbuja");
        
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int aux;
                if (A[i] > A[j]) {
                        this.swap(i, j);
                }
            }
        }
    }
    /**
     * Metodo InsertioSort 2
     * @param array 
     */
    public void insertionSort(int[] array) {
        this.copia( array );
        imprimir("Metodo InsertionSort");
        
        for (int i = 1; i < A.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(A[j] < A[j-1]){
                    this.swap(j, j-1);
                }
            }
        }
    }
    
    /**
     * Metodo MergeSort 3
     * @param A 
     */
    public void mergeSort(int [] A){
        this.copia(A);
        imprimir("Metodo MergeSort");
        this.mergeSort(0, this.A.length-1);
    }
    
    private void mergeSort(int ini,int fin){
        if(ini>=fin)return;
        int m=(ini+fin)/2;
        this.mergeSort(ini, m);
        this.mergeSort(m+1, fin);
        this.merge(ini, m, fin);
    }
    
    private void merge(int ini, int m, int fin) {
        int[] B=new int[fin-ini+1];
        int i,j,k;
        i=ini;
        j=m+1;
        k=0;
        while(i<=m&&j<=fin){
            
            if(A[i]<A[j]){
                B[k]=A[i];
                i++;
            }else{
                B[k]=A[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            B[k]=A[i];
            i++;
            k++;
        }
        while(j<=fin){
            B[k]=A[j];
            j++;
            k++;
        }
        i=ini;
        k=0;
        while(i<=fin){
            A[i]=B[k];
            i++;
            k++;
        }
    }
    /**
     * Metodo quickSort 4
     * @param A array 
     */
    public void quickSort(int[] A) {
        this.copia(A);
        imprimir("Metodo QuitSort2");
        this.quickSort2(0, this.A.length-1);  
    }
    private void quickSort(int ini, int fin) {
        int i, j, piv;
        if (ini >= fin)
            return;
        i=ini;                          
        j=fin;  
        piv=A[fin];
        while(i<j){                          
            while(A[i]<=piv && i<j){       
                i++;
            }    
            while(A[j]>piv){                
                j--;
            }
            if (i<j) {                                         
                swap(i,j);
            }
        }
        this.swap(i, j);
        quickSort(ini, i - 1);
        quickSort(i + 1, fin);
    }
    
    public void quickSort2( int ini, int fin) {
        int i,j,piv;
        if (ini >= fin)
            return;
                             
        i=ini;                          
        j=fin;  
        piv=A[ini];
        while(i<j){                          
            while(A[i]<=piv && i<j){       
                i++;
            }    
            while(A[j]>piv){                
                j--;
            }
            if (i<j) {                                         
                swap(i,j);
            }
        }
        swap(ini,j);  
        quickSort2(ini,j-1);   
        quickSort2(j+1,fin);            
    }
    
    /**
     * Metodo HeadSort
     * @param A array 
     */
    public void headSort(int[] A) {
        this.copia(A);
        imprimir("Metodo HeadSort");
        //this.quickSort2(0, this.A.length-1);  
    }
    
    /**
     * Metodo ShellSort
     * @param array 
     */
    public void shellSort(int [] array){
        copia(array);
        int i,j,k,m,fin;
        fin=A.length;
        m=A.length/2;
        
        while(m>0){
            i=m;
            while(i<=fin){
                j=i-m;
                while(j>=0){
                    k=j+m;
                    if(A[j]<=A[k])break;
                    else swap(j,k);
                    j=j-m;
                }
                i++;
            }
            m=m/2;
        }
    }
    
    /**
     * Metodo RadixSort
     * @param array 
     */
    public void radixSort(int [] array){
        copia(array);
        imprimir("RadixSort");
        List<Integer>[] pila = new ArrayList[10];
            for (int i = 0; i < pila.length; i++) {
                pila[i] = new ArrayList<Integer>();
        }
         
        boolean bandera = false;
        int tmp = -1;
        int divisor = 1;
        while (!bandera) {
            bandera = true;
            for (int i : A) {
                tmp = i / divisor;
                pila[tmp % 10].add(i);
                if (bandera && tmp > 0) {
                   bandera = false;
                }
            }
            int a = 0;
            for (int k = 0; k < 10; k++) {
                for (Integer i : pila[k]) {
                    A[a++] = i;
                }
                pila[k].clear();
            }
            divisor *= 10;
        }
        //imprimirArray();
    }
    
    
    /**
     * Metodo Intercambio
     * @param i primer paramentro a intercambiar
     * @param j segundo paramentro a intercambiar
     */
    private void swap(int i,int j) {
        int aux=this.A[i];
        this.A[i]=this.A[j];
        this.A[j]=aux;
    }
    
    private void copia(int[] array){
        this.A=new int [array.length];
        for(int i=0;i<array.length;i++){
            this.A[i]=array[i];
        } 
    }
    
    public void inicio(){
        this.inicio = new Date();
    }
    
    public void fin(){
        this.fin=new Date();
        System.out.println(fin+" diferencia:"+ ((fin.getTime()-inicio.getTime())/60));
        //this.imprimirArray();
    }
    
    private void imprimirArray(){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("\n");
    }
    private void imprimir(String a){
        System.out.println(a);
    }
}
