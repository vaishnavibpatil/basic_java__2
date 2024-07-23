public class circularqueue_usingArray 
{
    static class queue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }

        public static boolean isfull()
        {
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data)
        {
            if(isfull())
            {
                System.out.println("queue is full");
                return ;
            }

            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size ;
            arr[rear] = data;
        }

        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                return -1;
            }
            int result = arr[front];
            //last element
            if(rear == front)
            {
                rear = front = -1;
            }
           else
           {
            front = (front+1)%size;
           }
           return result;
        }

        public static void peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return ;
            }
           System.out.println(arr[front] +"-" + front);
        }
    }
        public static void main(String args[])
    {
        queue q = new queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        q.add(6);

        q.remove();
        q.add(7);
        
        
        


         while(! q.isEmpty())
         {
           q.peek();
           q.remove();
         }
     }
}
