public class postorder
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
        public void postorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +" ");

        }
       
    }
    public static void main(String args[])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t = new tree();
        Node root = t.binary(nodes);  
        System.out.println(root.data);

        t.postorder(root);
        
    }
}