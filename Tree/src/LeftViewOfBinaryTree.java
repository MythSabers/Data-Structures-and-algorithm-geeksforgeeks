import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class LeftViewOfBinaryTreeSolution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
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
            ans.add(temp.get(0));
        }
        return ans;
    }

    public ArrayList<Integer> leftViewRecursive(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        view(root, 0, a);
        return a;
    }

    private void view(Node root, int l, ArrayList<Integer> a) {
        if (root == null)
            return;
        if (l == a.size())
            a.add(root.data);
        view(root.left, l + 1, a);
        view(root.right, l + 1, a);
    }
}

public class LeftViewOfBinaryTree {
}
