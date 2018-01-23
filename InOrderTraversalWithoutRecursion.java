// code using recursion

void inOrderTraversal( TreeNode root){
  if(root == null){ return;}
  inOrderTraversal(root.left);
  System.out.print(root.val + "->");
  inOrderTraversal(root.right);
}

// code without recusrion 
void List<Integer> inOrderTraversal( TreeNode root){
  Stack<TreeNode> stack = new Stack<Integer>();
  TreeNode curr = root;
  List<Integer> result = ArrayList<>();
  while(!stack.isEmpty() || curr != null){
    if(curr !=null){
      stack.push (curr);
      curr = curr.left;
     } else {
       curr= curr.pop();
       result.add(curr.val);
       curr = curr.right;
     }
  }
  return result;
}
