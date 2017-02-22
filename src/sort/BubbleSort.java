package sort;

/**
 * 冒泡排序:重复的遍历数组，每次比较两个元素，如果顺序错误就调换过来。 每次遍历完一次数组，就将目前最大的数浮到后面。每次遍历减少后面一个。
 * 直到没有元素需要比较。
 * 
 * @author zwf
 *
 */
public class BubbleSort {

	public static <T extends Comparable<? super T>> void bubbleSort(T[] arr) {
		T temp;
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 如果前者比后者大，就交换位置。
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}

	// 优化1:如果某一趟遍历没有数据交换，则说明已经排好序，就不需要再进行迭代了，用一个标记记录状态即可。
	public static <T extends Comparable<? super T>> void bubbleSort1(T[] arr) {
		T temp;
		boolean flag;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag)
				break;
		}
	}
	
	// 优化2:记录某次遍历时最后发生交换的位置，这个位置后面的数据显然有序了。因此记录下最后发生交换的位置，可作为下次遍历的边界。
	public static <T extends Comparable<? super T>> void bubbleSort2(T[] arr) {
		T temp;
		boolean flag;
		int k;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			k = arr.length - 1 - i;
			for (int j = 0; j < k; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					k = j;
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag)
				break;
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[6];
		a[0] = 3;
		a[2] = 1;
		a[1] = 2;
		a[4] = 4;
		a[3] = 6;
		a[5] = 5;
		bubbleSort2(a);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
