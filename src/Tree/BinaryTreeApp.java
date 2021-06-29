package Tree;
public class BinaryTreeApp {
    
    public static void main(String[] args) {
        var tree = new binaryTree();
        
        TreeNode node;
        node = new TreeNode(60);
        tree.insert(node);
        
        node = new TreeNode(40);
        tree.insert(node);
        
        node = new TreeNode(30);
        tree.insert(node);
        
        node = new TreeNode(50);
        tree.insert(node);
        
        node = new TreeNode(80);
        tree.insert(node);
        
    
        System.out.println("Traversal dengan In Order : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan Pre Order : " );
        tree.postOrder();
        System.out.println("\nTraversal dengan Post Order : " );
        tree.inOrder();
        System.out.println();
       
        
  }
}
