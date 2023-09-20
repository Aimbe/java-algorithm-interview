package ch14;

import datatype.TreeNode;

public class P50_3 {
    public TreeNode invertTree(TreeNode root) {
        // 빈 노드가 아닐때 처리
        if (root != null) {
            invertTree(root.left);  // 왼쪽 자식 노드 DFS
            invertTree(root.right); // 오른쪽 자식 노드 DFS

            // 왼쪽/오른쪽 자식 노드 스왑
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }
}
