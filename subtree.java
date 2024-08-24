public class subtree
{
    static class Node{
        int data;
        Node left;
        Node right ;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isidentical(Node node,Node subroot)
    {
        if(node == null && subroot == null)
        {
            return true;
        }
        else if(node == null || subroot == null || node.data != subroot.data)
        {
            return false;
        }

        else if(!isidentical(node.left,subroot.left))
        {
            return false;
        }
        if(!isidentical(node.right,subroot.right))
        {
            return false;
        }
        return true;
    }

    public static boolean sub(Node root, Node subroot)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == subroot.data)
        {
            if(isidentical(root,subroot))
            {
                return true;
            }
        }
        boolean Lans = sub(root.left,subroot);
        boolean Rans = sub(root.right, subroot);
        return Lans || Rans ;


    }
    public static void main(String args[])
    {
        //tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        //subtree
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.print(sub(root,  subroot));
    }
}