
class HeightOfBinaryTreeSolution {
    public int height(Node root) {
        if (root == null)
            return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}


public class HeightOfBinaryTree {
    public static void main(String[] args) {

    }
}
