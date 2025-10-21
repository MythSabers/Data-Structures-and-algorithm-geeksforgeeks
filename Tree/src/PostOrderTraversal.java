import java.util.ArrayList;

class PostOrderTraversalSolution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(postOrder(root.left));
            list.addAll(postOrder(root.right));
            list.add(root.data);
        }
        return list;
    }
}


public class PostOrderTraversal {
}
