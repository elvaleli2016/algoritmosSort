/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;

import java.util.Date;

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
        
        for (int i = 1; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int aux;
                if (A[i] > A[j]) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
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
        this.quickSort(0, this.A.length-1);
        
    }
    private void quickSort(int ini, int fin) {
        int i, j, piv;
        if (ini >= fin)
            return;
        i = ini;
        j = fin - 1;
        piv = fin;
        while (i <= j) {
            while (i <= j && A[i] < A[piv]) {
                    i++;
            }
            while (i <= j && A[j] > A[piv]) {
                    j--;
            }
            if (i <= j) {
                    swap(i, j);
            }
        }
        swap(i, j);
        quickSort(ini, i - 1);
        quickSort(i + 1, fin);
    }
    
    /**
     * Metodo Intercambio
     * @param i primer paramentro a intercambiar
     * @param j segundo paramentro a intercambiar
     */
    private void swap(int i,int j) {
        int swap=A[i];
        A[i]=A[j];
        A[j]=swap;
    }
    
    public void copia(int[] array){
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
        this.imprimirArray();
    }
    
    public void imprimirArray(){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("\n");
    }
}
