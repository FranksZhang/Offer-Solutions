package sort;

/**
 * 插入排序
 * 步骤：
 * 1.从第一个元素开始，该元素可以认为已经排好序。
 * 2.取出下一个元素，在已排好序的序列中从后往前查找。
 * 3.如果被扫描的元素（已排序）大于新元素，将该元素后移一位。
 * 4.重复步骤3，直到找到已排序的元素小于或等于新元素的位置。
 * 5.将新元素插入到该位置之后。
 * 6.重复步骤2-5。
 * 
 * @author zwf
 *
 */
public class InsertionSort {
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
		int j;
		for(int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			for(j = i; j > 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
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
		insertionSort(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
