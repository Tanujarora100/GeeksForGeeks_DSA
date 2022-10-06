class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head==null)
        {
            return null;
        }
        
        if(head.next==null)
        {
            return head;
        }
        Node current=head;
        Node prev= null;
        
        while(current!=null)
        {
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
return prev;
    }
}
