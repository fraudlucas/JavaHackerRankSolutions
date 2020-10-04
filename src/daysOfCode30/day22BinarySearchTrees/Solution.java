package daysOfCode30.day22BinarySearchTrees;

import java.util.Scanner;


class BinarySearchTreesNode {
    BinarySearchTreesNode left, right;
    int data;

    BinarySearchTreesNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    public static int getHeight(BinarySearchTreesNode root) {
        //Write your code here
        if (root == null) {
            return -1;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static BinarySearchTreesNode insert(BinarySearchTreesNode root, int data) {
        if (root == null) {
            return new BinarySearchTreesNode(data);
        } else {
            BinarySearchTreesNode cur;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BinarySearchTreesNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}