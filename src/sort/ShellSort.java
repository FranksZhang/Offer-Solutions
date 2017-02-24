package sort;

/**
 * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法。
 * @author zwf
 *
 */
public class ShellSort {

	public static <T extends Comparable<? super T>> void shellSort(T[] arr) {
		//取第一次步长为数组长度一半
		int gap = arr.length >> 1;
		int i, j;
		for(; gap > 0; gap  >>= 1) {
			for(i = gap; i < arr.length; i++) {
				T temp = arr[i];
				for(j = i; j >= gap && temp.compareTo(arr[j-gap]) < 0; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
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
		shellSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
