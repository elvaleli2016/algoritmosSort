
public class ShellSort {

	void metodoShellSort(int [] A) {
		int salto, aux, i;
		boolean cambios;
		for (salto = A.length / 2; salto != 0; salto /= 2) {
			cambios = true;
			while (cambios) { // Mientras se intercambie alg�n elemento
				cambios = false;
				for (i = salto; i < A.length; i++) // se da una pasada
					if (A[i - salto] > A[i]) { // y si est�n desordenados
						aux = A[i]; // se reordenan
						A[i] = A[i - salto];
						A[i - salto] = aux;
						cambios = true; // y se marca como cambio.
					}
			}
		}
	}
}
