public class queue_usingLL 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class queue
    {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }

        public static void add(int data)
        {
            Node newnode = new Node(data);
            if(head == null)
            {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("already empty");
                return -1;
            }
            int front = head.data;
            if(head == tail )
            {
                head = tail = null;
            }
            else
            {
                head = head.next;
            }
            return front;

        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[])
    {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
      
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
