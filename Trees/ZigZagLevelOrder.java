ArrayList<Integer> zigZagTraversal(Node root)
	{
	   Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> arr = new  ArrayList<Integer>();
        int flag = 0;
        
        q.add(root);
        
        while (q.size() != 0 ){
            int s = q.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
          //Adding all the elements in the Queue First
            for (int i =0; i< s; i++){
                Node n = q.peek();
                q.remove();
                temp.add(n.data);
                
                if (n.left != null) 
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
          //If flag is True then add from the front
            if (flag == 0){
               for (int i =0; i< temp.size() ; i++ )
                arr.add(temp.get(i));
               flag = 1;
            }
            
            //Taking the last element in the list and adding it first to the Main List
            else if (flag == 1){
                for (int i = temp.size()-1; i>=0; i--){
                    arr.add(temp.get(i));
                }
                flag =0 ;
              //Setting the flag to False again for Next Iteration
            }
        }
        return arr;
	}
}
