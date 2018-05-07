
public class MergeSort2 {

	
	private int [] A;

    public MergeSort2(int[] A) {
        this.A = A;
        this.mergeSort(0, A.length-1);
        
    }
    
	void merge(int ini, int m, int fin) {
		int[] aux = new int[fin - ini + 1];
		int i, j, k;
		i = ini;
		j = m + 1;
		k = 0;
		while (i <= m && j <= fin) {
			if (A[i] < A[j]) {
				aux[k] = A[i];
				i = i + 1;
			} else {
				aux[k] = A[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i <= m) {
			aux[k] = A[i];
			i = i + 1;
			k = k + 1;
		}
		while (j <= fin) {
			aux[k] = A[j];
			j = j + 1;
			k = k + 1;
		}
		i = ini;
		k = 0;
		while (i <= fin) {
			A[i] = aux[k];
			i = i + 1;
			k = k + 1;
		}
	}

	void mergeSort(int ini, int fin) {
		if (ini >= fin) {
			return;
		}
		int m = (ini + fin) / 2;
		mergeSort(ini, m);
		mergeSort(m + 1, fin);
		merge(ini, m, fin);
	}
}
