import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversalLineByLineSolution {
    ArrayList<ArrayList<Integer>> printLineByLineArray(Node root) {
        if (root == null)
            return new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        ArrayList<ArrayList<Integer>> ansNode = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (queue.size() > 1) {
            Node curr = queue.poll();
            if (curr == null) {
                ArrayList<Integer> temp = new ArrayList<>(list);
                list.clear();
                ansNode.add(temp);
                queue.add(null);
                continue;
            }
            list.add(curr.data);
            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
        if (!list.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>(list);
            ansNode.add(temp);
        }

        return ansNode;
    }
}


public class LevelOrderTraversalLineByLine {
    public static void main(String[] args) {

    }
}
