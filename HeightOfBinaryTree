 def height(self, root):
        # code here
        if root is None:
            return 0
        rh=self.height(root.left)
        lh=self.height(root.right)
        return 1+max(rh,lh)
