package solutions;

import java.util.ArrayList;

/**
 * 题目：从尾到头打印链表
 * 
 * 描述：输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * @author wf
 *
 */
class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class PrintListByEnd {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> stack = new ArrayList<>();
		while (listNode != null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = stack.size() - 1; i >= 0; i--) {
			result.add(stack.get(i));
		}
		return result;
	}
}
