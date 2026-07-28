// https://leetcode.com/u/soumyojitbanerjee/
/**
Sum of Left Leaves(https://leetcode.com/problems/sum-of-left-leaves/description/):
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
**/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
      
        if(root==null) return 0 ;
        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null)
            {
                sum+=root.left.val;
             

            }
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
       
      return sum;
        
    }
}
