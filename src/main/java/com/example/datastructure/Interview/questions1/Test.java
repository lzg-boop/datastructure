package com.example.datastructure.Interview.questions1;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        //装载模拟数据 start
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode5.next =listNode6;
        //装载模拟数据 end

        SolutionAdd solutionAdd = new SolutionAdd();
        //翻转链表listNode1
        ListNode node1 = solutionAdd.flip(listNode1);
        //翻转链表listNode5
        ListNode node2 = solutionAdd.flip(listNode5);

        //进行计算
        ListNode add = solutionAdd.add(node1, node2);
        //再次翻转得到结果
        ListNode flip = solutionAdd.flip(add);
        System.out.print(flip.val);
        System.out.print(flip.next.val);
        System.out.print(flip.next.next.val);
        System.out.print(flip.next.next.next.val);
    }
}
