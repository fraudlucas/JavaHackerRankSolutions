package daysOfCode30.day23BSTlevelOrderTraversal;


import java.util.ArrayDeque;
import java.util.Scanner;

class BSTLevelOrderTraversalNode {
    BSTLevelOrderTraversalNode left, right;
    int data;

    BSTLevelOrderTraversalNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static void levelOrder(BSTLevelOrderTraversalNode root) {
        //Write your code here
        ArrayDeque<BSTLevelOrderTraversalNode> queueNodes = new ArrayDeque<>();

        if (root != null) {
            queueNodes.add(root);

            while (queueNodes.isEmpty() == false) {
                BSTLevelOrderTraversalNode currentNode = queueNodes.pollFirst();

                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    queueNodes.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queueNodes.add(currentNode.right);
                }
            }
        }

    }

    public static BSTLevelOrderTraversalNode insert(BSTLevelOrderTraversalNode root, int data) {
        if (root == null) {
            return new BSTLevelOrderTraversalNode(data);
        } else {
            BSTLevelOrderTraversalNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BSTLevelOrderTraversalNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
