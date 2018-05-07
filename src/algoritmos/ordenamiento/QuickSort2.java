
public class QuickSort2 {
	
	private int [] clon;

    public QuickSort2(int[] A) {
        this.clon = A;
        this.quickSort(0, this.clon.length-1);
        
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
			while (i <= j && clon[i] < clon[piv]) {
				i++;
			}
			while (i <= j && clon[j] > clon[piv]) {
				j--;
			}
			if (i <= j) {
				aux = clon[i];
				clon[i] = clon[j];
				clon[j] = aux;
			}
		}
		aux = clon[i];
		clon[i] = clon[piv];
		clon[piv] = aux;
		quickSort(ini, i - 1);
		quickSort(i + 1, fin);
	}
	
}
