def deleteMid(head):
    if head is None:
        return None
    fast = head.next
    slow = head
    while (fast != None and fast.next != None):
        fast = fast.next.next
        slow = slow.next

    fast = head
    while (fast.next != slow):
        fast = fast.next
    fast.next = fast.next.next
    return head

#Using Slow and Fast Pointer
# Problem link-https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/0