package sumOfPairInBST;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prince Jain
 * The {@code BST} class is an Implementation of a
 * Binary Search Tree using Doubly LinkedList.
 */

public class BinarySearchTree {
    static TreeNode root;
    static TreeNode newTreeNode;

    static ArrayList<Integer> TreeNodeList = new ArrayList<>();

    static void insert(TreeNode root, TreeNode newTreeNode) {
        if (newTreeNode.data > root.data) {
            if (root.right == null) root.right = newTreeNode;
            else insert(root.right, newTreeNode);
        } else {
            if (root.left == null) root.left = newTreeNode;
            else insert(root.left, newTreeNode);
        }
    }

    static void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        TreeNodeList.add(root.data);
        inOrderTraversal(root.right);
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of TreeNodes");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter data for TreeNode " + i);
            int data = sc.nextInt();
            newTreeNode = new TreeNode(data);
            if (root == null)
                root = newTreeNode;
            else
                insert(root, newTreeNode);
        }

        inOrderTraversal(root);
        System.out.println(TreeNodeList);
    }

    public void pairOfSum(int sum) {
        int count = 0;
        for (int i = 0; i < TreeNodeList.size(); i++) {
            for (int j = i + 1; j < TreeNodeList.size(); j++) {
                if (TreeNodeList.get(i) + TreeNodeList.get(j) == sum && !TreeNodeList.get(i).equals(TreeNodeList.get(j))) {
                    System.out.println("[" + TreeNodeList.get(i) + " , " + TreeNodeList.get(j) + "]");
                    count = count + 1;
                }
            }
        }

        if (count == 0)
            System.out.println("Pair NOT FOUND");
        else
            System.out.println("Total Pairs " + count);
    }
}
