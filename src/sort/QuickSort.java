package sort;

/**
 * 快速排序：
 * 
 * @author zwf
 *
 */
public class QuickSort {

	private static final int CUTOFF = 4;
	
	public static <T extends Comparable<? super T>> void quickSort(T[] arr) {
		quickSort(arr, 0, arr.length-1);
		
	}
	
	private static <T extends Comparable<? super T>> void quickSort(T[] arr, int left, int right) {
		if((left + CUTOFF) <= right) {
			T pivot = median3(arr, left, right);
			int i = left , j = right - 1;
			
			for(;;) {
				while(arr[--j].compareTo(pivot) > 0) {}
				while(arr[++i].compareTo(pivot) < 0) {}
				if(i < j)
					swap(arr, i, j);
				else
					break;
			}
			swap(arr, i, right - 1);
			
			quickSort(arr, left, i-1);
			quickSort(arr, i+1, right);
			
		} else {
			InsertionSort.insertionSort(arr);
		}
			
		
	}
	
	private static <T extends Comparable<? super T>> T median3(T[] a, int left, int right) {
		int center = (left + right) / 2;
		if(a[center].compareTo(a[left]) < 0)
			swap(a, center, left);
		if(a[left].compareTo(a[right]) > 0)
			swap(a, left, right);
		if(a[right].compareTo(a[center]) < 0)
			swap(a, right, center);
		
		swap(a, center, right - 1);
		return a[right - 1];
	}
	
	private static <T extends Comparable<? super T>> void swap(T[] arr, int left, int right) {
		T temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[6];
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		a[3] = 6;
		a[4] = 4;
		a[5] = 5;
		quickSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
		
}
