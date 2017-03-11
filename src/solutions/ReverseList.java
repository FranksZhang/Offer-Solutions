package solutions;

/**
 * 题目：反转链表
 * 
 * 描述：输入一个链表，反转链表后，输出链表的所有元素。
 * 
 * 思路：利用三个指针，分别指向当前结点，前一个和后一个结点。
 * 
 * @author zwf
 *
 */
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class ReverseList {
	public ListNode1 ListReverse(ListNode1 head) {
		ListNode1 prev = null;
		ListNode1 reverseHead = null;
		ListNode1 node = head;
		while(node != null) {
			ListNode1 next = node.next;
			if(next == null)
				reverseHead = node;
			node.next = prev;
			prev = node;
			node = next;
		}
		return reverseHead;
    }
}
