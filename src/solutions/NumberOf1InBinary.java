package solutions;

/**
 * 题目：二进制中1的个数
 * 
 * 描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * 思路：把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0
 * 
 * @author wf
 *
 */
public class NumberOf1InBinary {
	public int NumberOf1(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
    }
}
