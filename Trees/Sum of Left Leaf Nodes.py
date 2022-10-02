def leftLeavesSum(root_node):
    # Complete this function
   
    if not root_node:
        return 0
    
    left = root_node.left
    if left and not left.left and not left.right:
        return left.data + leftLeavesSum(root_node.right)
    
    return leftLeavesSum(root_node.left) + leftLeavesSum(root_node.right)
