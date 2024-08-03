public class diameter 
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
    public static int Hei(Node root)
        { 
            if(root == null)
            {
                return 0;
            }
             int lh = Hei(root.left);
             int rh = Hei(root.right);
             return Math.max(lh,rh)+1;
            
        }
    public static int dia(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int LH = Hei(root.left);
        int Ldia = dia(root.left);
        int RH = Hei(root.right);
        int Rdia = dia(root.right);

        int self = LH + RH + 1;
        return Math.max(self,Math.max(Ldia,Rdia));

    }
    public static void main(String args[])
    {
        


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(9);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        System.out.print("diameter of the tree = " + dia(root));


        
    }
    
}

    

