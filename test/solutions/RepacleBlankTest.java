package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepacleBlankTest {

	
	@Test
	public void test() {
		RepacleBlank replace = new RepacleBlank();
		assertEquals("算法有问题", "We%20Are%20Happy", replace.replaceSpace(new StringBuffer("We Are Happy")));
	}
}
