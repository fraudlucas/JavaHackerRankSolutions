package daysOfCode30.day24MoreLinkedLists;


import java.util.Scanner;


class MoreLinkedListsNode {
    int data;
    MoreLinkedListsNode next;

    MoreLinkedListsNode(int d) {
        data = d;
        next = null;
    }

}

class Solution {

    public static MoreLinkedListsNode removeDuplicates(MoreLinkedListsNode head) {
        //Write your code here
        MoreLinkedListsNode previousNode = head;
        MoreLinkedListsNode nextNode = head.next;

        while (nextNode != null) {
            if (nextNode.data == previousNode.data) {
                previousNode.next = nextNode.next;
            } else {
                previousNode = nextNode;
            }

            nextNode = nextNode.next;
        }

        return head;
    }

    public static MoreLinkedListsNode insert(MoreLinkedListsNode head, int data) {
        MoreLinkedListsNode p = new MoreLinkedListsNode(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            MoreLinkedListsNode start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(MoreLinkedListsNode head) {
        MoreLinkedListsNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MoreLinkedListsNode head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
