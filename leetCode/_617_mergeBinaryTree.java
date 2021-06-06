
class _617_mergeBinaryTree {
	
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        else if(root1 == null && root2 != null){
            return root2;
        }
        else if(root1 != null && root2 == null){
            return root1;
        }
        
        TreeNode sumTree = new TreeNode(root1.val+root2.val);
        sumTree.left = mergeTrees(root1.left,root2.left);
        sumTree.right = mergeTrees(root1.right,root2.right);
        
        return sumTree;
    }
 
}

