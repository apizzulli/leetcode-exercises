# Definition for a binary tree node.
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
def isValidBST(root: Optional[TreeNode]) -> bool:
        def validate(node: Optional[TreeNode], minimum: int, maximum: int)-> bool:
            if node:
                print("Node " + str(node.val)+ ": min = "+str(minimum)+ ", max = "+str(maximum))
                if node.val >= maximum or node.val <= minimum:
                    return False
                return validate(node.left, minimum, min(maximum, root.val)) and validate(node.right, min(minimum, root.val), maximum)
            else:
                return True
        if root:
            return validate(root.left, float('-inf'), root.val) and validate(root.right, root.val, float('inf'))
        return False

if __name__ == "__main__":
    node0 = TreeNode(0)
    node2 = TreeNode(2)
    node4 = TreeNode(4)
    node6 = TreeNode(6)

    node1 = TreeNode(1, node0, node2)
    node5 = TreeNode(5, node4, node6)

    root = TreeNode(3, node1, node5)
    v = isValidBST(root)
    print(str(v))
