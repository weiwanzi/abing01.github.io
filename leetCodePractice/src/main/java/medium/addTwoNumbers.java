package medium;

import java.util.LinkedList;

public class addTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //先定义一个虚拟节点，可以解决之后头节点为空
        ListNode dummy = new ListNode(0);
        //定义一个存放是否进位
        int carry = 0;
        //定义一个存放当前节点的的节点
        ListNode curr = dummy;
        //写个whlie判断，要实现l1,l2都不为空才结束，哪个为空哪个补0
        while (l1 != null || l2 != null) {
            //判断l1,l2是否为null，为null则为0，不为null则为对应的val
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            //判断是否需要进位
            int sum = x + y + carry;
            carry = sum / 10;
            //此时sum为要存放再新（curr）上的节点值
            sum = sum % 10;
            //将sum放入(加next是此时要做的是把next指向下一个)
            curr.next = new ListNode(sum);
            //curr往后走
            curr = curr.next;
            //当本次结束时，让l1,跟l2往下走
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //走到最后，要判断最后一次是否还有进位
        if (carry != 0){curr.next = new ListNode(1);}
        return dummy.next;
    }

}
