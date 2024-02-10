package sumOfPairInBST;

import java.util.Scanner;

public class App {
	 public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();

	        tree.create();

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter sum value whose pair to be found");
	        int sum = sc.nextInt();
	        tree.pairOfSum(sum);
	    }

}
