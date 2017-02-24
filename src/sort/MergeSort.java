package sort;

/**
 * 归并排序
 * 
 * @author zwf
 *
 */
public class MergeSort {

	public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
		T[] temp = (T[]) new Comparable[arr.length];
		
		mergeSort(arr, temp, 0, arr.length - 1);
	}
	
	
	private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] temp, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2;
			mergeSort(a, temp, left, center);
			mergeSort(a, temp, center+1, right);
			merge(a, temp, left, center+1, right);
		}
	}
	
	private static <T extends Comparable<? super T>> void merge(T[] a, T[] temp, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tempPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		
		while(leftPos <= leftEnd && rightPos <= rightEnd) {
			if(a[leftPos].compareTo(a[rightPos]) <= 0)
				temp[tempPos++] = a[leftPos++];
			else
				temp[tempPos++] = a[rightPos++];
		}
		while(rightPos <= rightEnd)
			temp[tempPos++] = a[rightPos++];
		
		while(leftPos <= leftEnd)
			temp[tempPos++] = a[leftPos++];
		
		for(int i = 0; i < numElements; i++, rightEnd--)
			a[rightEnd] = temp[rightEnd];
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[6];
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		a[3] = 6;
		a[4] = 4;
		a[5] = 5;
		mergeSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
