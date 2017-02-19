package solutions;

import java.util.Stack;

/**
 * 题目：用两个栈实现队列
 * 
 * 描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 * 思路：入队列的时候先进入栈1，出队列时从栈2出。如果栈2为空了，就把栈1的所有元素弹出再压入栈2，
 * 经过两次先进后出的栈后，数据就变成先进先出了。
 * 
 * @author wf
 *
 */
public class TwoStackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() throws Exception {
    	if(stack2.isEmpty()) {
    		while(stack1.size() > 0) {
    			int temp = stack1.pop();
    			stack2.push(temp);
    		}
    	}
    	if(stack2.isEmpty())
    		throw new Exception("queue is empty");
    	
    	return stack2.pop();
    		
    }
}
