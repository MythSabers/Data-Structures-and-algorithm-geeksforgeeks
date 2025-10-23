import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class RightViewOfBinaryTreeSolution {
    public ArrayList<Integer> rightView(Node root) {
        if (root == null)
            return new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        ArrayList<ArrayList<Integer>> ansNode = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
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
        for (ArrayList<Integer> temp : ansNode) {
            ans.add(temp.get(temp.size() - 1));
        }
        return ans;
    }

    public ArrayList<Integer> rightViewRecursive(Node root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        view(root, 0, nodes);
        return nodes;
    }

    private void view(Node root, int l, ArrayList<Integer> nodes) {
        if (root == null)
            return;
        if (l == nodes.size())
            nodes.add(root.data);
        view(root.right, l + 1, nodes);
        view(root.left, l + 1, nodes);
    }
}


public class RightViewOfBinaryTree {
    public static void main(String[] args) {

    }
}
