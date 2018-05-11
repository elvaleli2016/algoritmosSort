/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eliam
 */
public class Heap {
    int[] A;

    public Heap(int length) {
        A = new int[length+1];
    }
    
    public void insertHeap(int x,int n){
        n=n+1;
        A[n]=x;
        siftUp(n);
    }
    
    private void siftUp(int n){
        int i=n;
        while(i>1){
            if(A[i]<A[i/2]){
                swap(i,i/2);
                i/=2;
            }   
        }
        
    }
    
    public int eliminarHeap(int n){
        int aux=A[1];
        A[n]=A[1];
        siftDown(n);
        return aux;
    }
    
    private void siftDown(int n){
        int i,h;
        i=1;
        while(true){
            h=i*2;
            if(h>n)return;
            if(h+1<=n)
                if(A[h+1]<A[h])
                    h++;
            if(A[h]>A[i])return;
            swap(i,h);
            i=h;
        }
    }
    
    private void swap(int i,int j) {
        int aux=this.A[i];
        this.A[i]=this.A[j];
        this.A[j]=aux;
    }
    
    
}
