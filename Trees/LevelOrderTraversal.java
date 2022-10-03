import java.util.*;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// ArrayList<Integer> list= new ArrayList<>();
        Queue<BinaryTreeNode> q= new LinkedList<>();
        
		q.add(root);
        q.add(null);
        while(q.size()!=0)
        {
      BinaryTreeNode<Integer> front=q.poll();
            if (front==null)
            {
                if (q.isEmpty())
                    break;
                else
                {
                    System.out.println();
                	q.add(null);
                }
                
            }
            else
            {
                System.out.print(front.data+" ");
                if (front.left!=null)
                    q.add(front.left);
                if (front.right!=null)
                    q.add(front.right);
            }
        }
	}
	
}
