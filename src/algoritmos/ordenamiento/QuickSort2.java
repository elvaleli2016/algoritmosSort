package algoritmos.ordenamiento;

public class QuickSort2 {
	
	private int [] A;

    public QuickSort2(int[] A) {
        this.A = A;
        this.quickSort(0, A.length-1);
        
    }
    void quickSort(int ini, int fin) {
            int i, j, piv, aux;
            if (ini >= fin)
                    return;

            i = ini;
            j = fin - 1;
            piv = fin;
            aux = 0;
            while (i <= j) {
                    while (i <= j && A[i] < A[piv]) {
                            i++;
                    }
                    while (i <= j && A[j] > A[piv]) {
                            j--;
                    }
                    if (i <= j) {
                            aux = A[i];
                            A[i] = A[j];
                            A[j] = aux;
                    }
            }
            aux = A[i];
            A[i] = A[piv];
            A[piv] = aux;
            quickSort(ini, i - 1);
            quickSort(i + 1, fin);
    }
	
}
