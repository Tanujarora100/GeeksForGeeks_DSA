class Solution
{
    void leftTraverse(Node node, ArrayList<Integer> arr)
    {
        if(node==null)
        {
            return;
        }
        if(node.left==null && node.right==null)
        {
            return;
        }
        arr.add(node.data);
        if(node.left!=null)
        {
            leftTraverse(node.left, arr);
        }
        else
        {
            leftTraverse(node.right,arr);
        }
    }
    
    void leafprint(Node node, ArrayList<Integer> arr)
    {
        if(node==null)
        {
            return;
        }

        if(node.left==null && node.right==null)
        {
            arr.add(node.data);
        }
        leafprint(node.left,arr);
        leafprint(node.right,arr);
    }
    void rightPrint(Node node, ArrayList<Integer> arr)
    {
        if(node==null)
        {
            return;
        }
        if(node.left==null && node.right==null)
        {
            return;
        }
       
        if(node.right!=null)
        {
            rightPrint(node.right, arr);
        }
        else
        {
            rightPrint(node.left,arr);
        }
         arr.add(node.data);
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> arr= new ArrayList<>();
	    arr.add(node.data);
	    leftTraverse(node.left, arr);
	    leafprint(node.left, arr);
	    leafprint(node.right, arr);
	    rightPrint(node.right, arr);
	    return arr;
	}
}
