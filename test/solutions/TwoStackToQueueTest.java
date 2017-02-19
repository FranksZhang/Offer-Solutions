package solutions;

import junit.framework.Assert;

import org.junit.Test;


public class TwoStackToQueueTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception {
		TwoStackToQueue queue = new TwoStackToQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		Assert.assertEquals(queue.pop(), 1);
	}
	
//	public static void main(String[] args) throws Exception {
//		TwoStackToQueue queue = new TwoStackToQueue();
//		queue.push(1);
//		queue.push(2);
//		queue.push(3);
//		System.out.println(queue.pop());
//	}
}
