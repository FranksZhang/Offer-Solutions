package sort;

public class HeapSort {

	private static int leftChild(int i) {
		return 2 * i + 1;
	}
	
	private static <T extends Comparable<? super T>> void percDown(T[] a, int i, int n) {
		int child;
		T temp;
		
		for(temp = a[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			if(child != n - 1 && a[child].compareTo(a[child + 1]) < 0)
				child++;
			if(temp.compareTo(a[child]) < 0)
				a[i] = a[child];
			else 
				break;
		}
		a[i] = temp;
		
	}
	
	private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static <T extends Comparable<? super T>> void headSort(T[] a) {
		for(int i = a.length / 2 - 1; i >= 0; i--)
			percDown(a, i, a.length);
		for(int i = a.length - 1; i > 0; i--) {
			swap(a, 0, i);
			percDown(a, 0, i);
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[6];
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		a[3] = 6;
		a[4] = 4;
		a[5] = 5;
		headSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
