import java.util.*;
public class leveltraversal
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            left= null;
            right =null;
        }
    }

    static class tree
    {
        static int idx = -1;
        public  Node binary(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left=binary(nodes);
            newnode.right=binary(nodes);

            return newnode;
        }

        public void levelorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(! q.isEmpty())
            {
                Node curr = q.remove();
                if(curr == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(curr.data + " ");
                    if(curr.left != null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
            }

        }
       
    }
    public static void main(String args[])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t = new tree();
        Node root = t.binary(nodes);  
        System.out.println(root.data);
        t.levelorder(root);
    }
}