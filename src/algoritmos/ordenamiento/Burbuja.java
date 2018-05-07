
public class Burbuja {

	private int [] A;

    public Burbuja(int[] A) {
        this.A = A;
        this.ordenarMetodoBurbuja();
        
    }
	void ordenarMetodoBurbuja() {
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
}
