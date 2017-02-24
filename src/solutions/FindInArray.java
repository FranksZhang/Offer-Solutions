package solutions;

/**
 * 题目：二维数组中的查找
 * 
 * 描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author wf
 *
 */
public class FindInArray {
	public boolean Find(int target, int [][] array) {
		boolean find = false;
		int rows = array.length;
		int columns = array[0].length;
		
		if(array != null && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1;
			while(row < rows & column >= 0) {
				if(array[row][column] == target) {
					find = true;
					break;
				} 
				else if(array[row][column] > target)
					column--;
				else
					row++;
			}
		}
		return find;
    }
	
}
