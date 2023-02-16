# Intuition

Is simple recursion a good way to solve this problem?

# Approach

Let's desctibe the recursion. End condition is situation when given tree root is ```null```. In this case we will return ```0```. But if is not null, if maybe will have left and right childs. Let's call current method agan for left and for right child and choose maximum value from these two results. Important not to forget increment this value because transition from current tree level to more deep was done "by hand", and we should remember about when.

# Complexity
- Time complexity:
  $O(n)$, because we should to iterate by all tree leaves.

- Space complexity:
  $O(n)$, because java recursion uses stack memory, and stack memory will stores all tree leaves (something like "history of method calls") during the recursion is working.

# Code
```
/** Definition for a binary tree node. */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/** Problem solution */
class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }
    }
    
}
```