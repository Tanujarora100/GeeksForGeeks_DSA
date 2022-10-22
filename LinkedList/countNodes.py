class Solution:
   
    def getCount(self, head_node):
        count=1
        temp= head_node
        while(temp.next):
            
            count=count+1
            temp= temp.next
        return count
