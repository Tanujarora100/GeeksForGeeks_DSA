package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class mirrorOfTree {
    static void lineByLine(node root) {
        Queue<node> q = new LinkedList<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                node temp = q.remove();
                // ans.add(temp.data);
                // System.out.print("Line:" + line);
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }

            }
            System.out.println();
        }
    }

    static node mirror(node root) {
        if (root == null)
            return null;
        mirror(root.left);
        mirror(root.right);
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public static void main(String[] args) {
        node root = new node(10);
        node leftChild = new node(12);
        node rightChild = new node(14);
        node leftLeftChild = new node(8);
        node rightRightChild = new node(18);
        root.left = leftChild;
        leftChild.left = leftLeftChild;
        root.right = rightChild;
        rightChild.right = rightRightChild;
        lineByLine(root);
        mirror(root);
        System.out.println();
        System.out.println("INVERTED TREE BELOW\n");
        lineByLine(root);

    }
}
