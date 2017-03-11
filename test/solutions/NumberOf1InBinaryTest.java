package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOf1InBinaryTest {

	@Test
	public void test() {
		NumberOf1InBinary noi = new NumberOf1InBinary();
		int n = -8;
		assertEquals("算法有问题", 29, noi.NumberOf1(n));
	}
}
