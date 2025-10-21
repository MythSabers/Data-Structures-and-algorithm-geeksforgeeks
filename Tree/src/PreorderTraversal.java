
import java.util.ArrayList;

class PreorderTraversalSolution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.data);
            list.addAll(preOrder(root.left));
            list.addAll(preOrder(root.right));
        }
        return list;
    }
}


public class PreorderTraversal {
}
