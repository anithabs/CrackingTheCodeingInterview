
//Consider a binary tree in which each node contains a binary deigit.


public static int sumRootToLeaf(BinaryTreeNode root){
  return sumRootToLeafHealper(root, 0);
}
  
public static int sumRootToLeafHealper(BinaryTreeNode root , int partialSum){
  if(root == null){ return 0;}
  partialSum = partialSum * 2 + root.data;
  if( root.right == null && root.left == null){
    return partialSum;
  }
  return sumRootToLeafHealper(root.left , partialSum) + sumRootToLeafHealper(root.right , partialSum);
}
