package solutions;

/**
 * 题目：替换空格
 * 
 * 描述：请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * 前提：前提是必须在原字符串上修改。如果可以利用一个新的String来复制。就直接从头到尾复制最快。
 * 思路：普通思路是从头到尾扫描字符串，每一次碰到空格字符就做替换。该算法的时间复杂度为O(n^2)
 * 	   较好思路：先遍历一次字符串，统计出空格总数，然后计算出替换后的字符串的总长度。然后从字符串后面开始复制和替换。该算法的时间复杂度为O(n).
 *
 * @author wf
 *
 */
public class RepacleBlank {
	public String replaceSpace(StringBuffer str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				count++;
		}
		
		int oldIndex = str.length() - 1;
		int newLength = str.length() + count * 2;
		int newIndex = newLength - 1;
		str.setLength(newLength);
		for(;oldIndex >= 0;--oldIndex) {
			if(str.charAt(oldIndex) == ' ') {
				str.setCharAt(newIndex--, '0');
				str.setCharAt(newIndex--, '2');
				str.setCharAt(newIndex--, '%');
			} else {
				str.setCharAt(newIndex--, str.charAt(oldIndex));
			}
		}
		
		return str.toString();
	}
}
