import java.util.*;
public class queue_usingdeque 
{
    static class queue
    {
        Deque<Integer> d = new LinkedList<>();

        public  void add(int data)
        {
            d.addLast(data);
        }
        public int remove()
        {
            return d.removeFirst();
        }
        public  int peek()
        {
            return d.getFirst();
        }
    }
    public static void main(String args[])
    {
        queue s = new queue();
        s.add(1);
        s.add(2);
        s.add(3);

        // System.out.println(s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());

       
    }
    
}
