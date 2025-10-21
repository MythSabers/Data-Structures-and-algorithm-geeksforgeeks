import java.util.ArrayList;

class InOrderTraversalSolution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(inOrder(root.left));
            list.add(root.data);
            list.addAll(inOrder(root.right));
        }
        return list;
    }
}


public class InOrderTraversal {
}
