import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by cagekira on 5/2/16.
 */
public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        ListNode res = null;
        while(tmpA != null){
            countA++;
            tmpA = tmpA.next;
        }
        while(tmpB != null){
            countB++;
            tmpB = tmpB.next;
        }
        if(countA >= countB){
            res = findIntersection(headA, headB, (countA-countB));
        }else{
            res = findIntersection(headB, headA, (countB-countA));
        }
        return res;
    }

    public static ListNode findIntersection(ListNode longNode, ListNode shortNode, int diff){
        while(diff > 0){
            diff--;
            longNode = longNode.next;
        }
        while(longNode != null && shortNode != null){
            if(longNode.equals(shortNode)) return longNode;
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return null;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode result = getIntersectionNode(l1,l2);
        System.out.print(result.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
