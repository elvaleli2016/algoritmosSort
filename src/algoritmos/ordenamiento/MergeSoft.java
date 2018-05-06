/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;

/**
 *
 * @author Eliam
 */
public class MergeSoft {
    private int [] A;

    public MergeSoft(int[] A) {
        this.A = A;
        this.mergeS(0, (this.A.length-1));
    }
    
    private void mergeS(int ini,int fin){
        if(ini>=fin)return;
        int m=(ini+fin)/2;
        this.mergeS(ini, m);
        this.mergeS(m+1, fin);
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
    
}
