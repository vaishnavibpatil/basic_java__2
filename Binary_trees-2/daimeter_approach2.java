public class daimeter_approach2 
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
    static class info
    {
        int ht;
        int dia;

        public info(int dia, int ht)
        {
            this.dia = dia;
            this.ht = ht;
        }
    }


    public static info diameter(Node root)
    {
        if(root == null)
        {
            return new info(0,0);
        }

        info Linfo = diameter(root.left);
        info Rinfo = diameter(root.right);

        int dia = Math.max(Math.max(Linfo.dia,Rinfo.dia),Linfo.ht + Rinfo.ht + 1 );
        int ht = Math.max(Linfo.ht , Rinfo.ht)+1;
        return new info(dia,ht);


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


        System.out.print("height of the tree = " + diameter(root).dia);
        
    }
    
}

    

