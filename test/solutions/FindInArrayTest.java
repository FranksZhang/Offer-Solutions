package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindInArrayTest {
	@Test
	public void test() {
		FindInArray fia = new FindInArray();
		int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		assertEquals("算法有问题", true, fia.Find(7, a));
	}
}