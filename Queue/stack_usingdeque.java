import java.util.*;
public class stack_usingdeque 
{
    static class stack
    {
        Deque<Integer> d = new LinkedList<>();

        public  void push(int data)
        {
            d.addLast(data);
        }
        public int pop()
        {
            return d.removeLast();
        }
        public  int peek()
        {
            return d.getLast();
        }
    }
    public static void main(String args[])
    {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

       
    }
    
}
