package com.example.datastructure.Interview.questions1;


import sun.security.provider.Sun;

/**
 * 计算链表
 */
public class SolutionAdd {
    /**
     * 翻转方法，把单向链表翻转
     *
     * @param listNode
     * @return
     */
    public ListNode flip(ListNode listNode) {
        ListNode pre = null;
        ListNode succ = null;
        while (listNode != null) {
            succ = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = succ;
        }
        return pre;
    }

    /**
     * 计算的单向链表求和
     * @param node1
     * @param node2
     * @return
     */
    public ListNode add(ListNode node1, ListNode node2) {
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        int sum = 0;
        while (node1!=null || node2 != null || sum != 0){
            if (node1!=null){
                sum += node1.val;
                node1=node1.next;
            }
            if (node2 != null){
                sum += node2.val;
                node2 = node2.next;
            }
            p.next= new ListNode(sum % 10);
            sum = sum/10;
            p = p.next;
        }
        return listNode.next;
    }
}
