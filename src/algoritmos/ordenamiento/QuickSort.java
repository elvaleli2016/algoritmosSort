/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 *
 * @author Eliam
 */
public class QuickSort {
    private int[] A;

    public QuickSort(int[] A) {
        this.A = A;
        this.QuickS(0,(A.length-1));
    }

    private void QuickS(int ini, int fin) {
        if(ini>=fin)return;
        int i,j,piv;
        i=ini;
        j=fin;
        piv=i+(j-i)/2;
        while(i<=j){
            while(A[i]<A[piv])
                i++;
            while(A[j]>A[piv])
                j--;
            if(i<=j){
                this.swap(i,j);
                i++;
                j--;
            }      
        }
        this.QuickS(ini, i-1);
        this.QuickS(i+1, fin);
    }

    private void swap(int i,int j) {
        int swap=A[i];
        A[i]=A[j];
        A[j]=swap;
    }
    
    
    
}
