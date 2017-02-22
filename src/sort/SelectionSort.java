package sort;

/**
 * 选择排序：数组分成有序区和无序区，初始时整个数组都是无序区，然后每次从无序区选一个最小的元素直接放到有序区的最后，直到整个数组变有序区。
 *
 * @author zwf
 *
 */
public class SelectionSort {

	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		T temp;
		int min;
		
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min].compareTo(arr[j]) > 0)
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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
		selectionSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
