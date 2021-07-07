package algoritmos;

public class HeapSort {

	private static void heapify(int a[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n)
			if (a[child] > a[max])
				max = child;
		if (child + 1 < n)
			if (a[child + 1] > a[max])
				max = child + 1;
		if (max != i) {
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			heapify(a, n, max);
		}
	}

	private static void buildheap(int a[]) {
		for (int i = a.length / 2 - 1; i >= 0; i--)
			heapify(a, a.length, i);
	}

	public static void heapsort(int a[]) {
		buildheap(a);
		for (int i = a.length - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, i, 0);
		}
	}
    
        
       	// -----------------------------------------------------

	private static void heapify_interactive(int a[], int n, int i) {
		int aux = a[i];
		int j = i * 2 + 1;
		while (j <= n) {
			if (j < n)
				if (a[j] < a[j + 1]) // pai tem dois filhos? Quem é o maior?
					j = j + 1;
			if (aux < a[j]) { // filho maior que o pai?
				a[i] = a[j]; // filho se torna o pai
				i = j; // repetir o processo (substitui a recursividade)
				j = 2 * i + 1;
			} else
				j = n + 1;
		}
		a[i] = aux; // antigo pai ocupa lugar do último filho analisado
	}

	private static void buildheap_interactive(int a[]) {
		for (int i = a.length / 2 - 1; i >= 0; i--)
			heapify_interactive(a, a.length - 1, i);
	}

	public static void heapsort_interactive(int a[]) {
		buildheap_interactive(a);
		for (int i = a.length - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify_interactive(a, i - 1, 0);
		}
	}

	// implentação alternativa
	// -----------------------
	private static int total;

	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	private static void heapify2(int[] arr, int i) {
		int lft = i * 2;
		int rgt = lft + 1;
		int grt = i;

		if (lft <= total && arr[lft] > arr[grt])
			grt = lft;
		if (rgt <= total && arr[rgt] > arr[grt])
			grt = rgt;
		if (grt != i) {
			swap(arr, i, grt);
			heapify2(arr, grt);
		}
	}

	public static void heapsort2(int[] arr) {
		total = arr.length - 1;
		for (int i = total / 2; i >= 0; i--)
			heapify2(arr, i);
		for (int i = total; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify2(arr, 0);
		}
	}

	// --------------------------------------------------

	public static void heapsort3(int[] arr) {
		bottom_up_heapsort(arr.length - 1, arr);
	}

	public static void bottom_up_heapsort(int n, int v[]) {
		int m, f, max, t;
		constroi_heap(n, v);
		for (m = n; m > 0; m--) {
			max = v[0];
			f = 1;
			while (f <= m) {
				if (f < m && v[f] < v[f+1])
					f++;
				v[f/2] = v[f];
				f *= 2;
			}
			f = f / 2;
			if (f < m) {
				t = v[f];
				v[f] = v[m];
				v[m] = t;
				while (f > 1 && v[f/2] < v[f]) {
					t = v[f];
					v[f] = v[f/2];
					v[f/2] = t;
					f = f / 2;
				}
			}
			v[m] = max;
		}
	}

	public static void constroi_heap(int n, int v[]) {
		int m, f, t;
		for (m = 0; m < n; m++) {
			f = m + 1;
			while (f > 1 && v[f/2] < v[f]) {
				t = v[f/2];
				v[f/2] = v[f];
				v[f] = t;
				f = f / 2;
			}
		}
	}

}