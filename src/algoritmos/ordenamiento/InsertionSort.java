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
public class InsertionSort {
    private int [] A;

    public InsertionSort(int[] A) {
        this.A = A;
        this.insertionS();
    }
    
    private void insertionS(){
        int temp;
        for (int i = 1; i < A.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(A[j] < A[j-1]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
    }
}
