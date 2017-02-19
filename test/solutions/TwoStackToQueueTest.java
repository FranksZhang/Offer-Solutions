package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoStackToQueueTest {

	@Test
	public void test() throws Exception {
		TwoStackToQueue queue = new TwoStackToQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		assertEquals("算法有问题",queue.pop(), 1);
	}
	
}
