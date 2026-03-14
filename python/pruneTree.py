# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def pruneTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def containsOne(root: Optional[TreeNode]):
            if not root:
                return True
            if root.val == 1:
                return True
            else:
                return containsOne(root.left) or containsOne(root.right)
        def prune(root: Optional[TreeNode]):
            if root:
                if root.left:
                    prune(root.left)
                if root.right:
                    prune(root.right)
                if not root.left and not root.right:
                    if root.val != 1:
                        root = None
                # left = root.left
                # right = root.right
                # if not containsOne(left):
                #     print('true')
                #     root.left = None
                # if not containsOne(right):
                #     print('true2')
                #     root.right = None
                # prune(left)
                # prune(right) 
            return
        prune(root)
        return root
if __name__ == "__main__":
    sol = Solution()
    print("test 1-> : " + sol.pruneTree("ABCABC", "ABC"))  # Output: "ABC"
    print("test 2 -> : " + sol.gcdOfStrings("ABABAB", "ABAB"))
    print("test 3 -> : " + sol.gcdOfStrings("LEET", "CODE"))
    print("gcd 48, 36 = " + str(sol.gcd(48,36)))
