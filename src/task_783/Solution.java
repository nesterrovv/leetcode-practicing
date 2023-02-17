package task_783;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        searchValues(root);
        int minDiff = 100001;
        for (int i = 0; i < list.size() - 1; i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i + 1)));
        }
        return minDiff;
    }

    private void searchValues(TreeNode root) {
        if (root == null) {
            return;
        }
        searchValues(root.left);
        list.add(root.val);
        searchValues(root.right);
    }

}