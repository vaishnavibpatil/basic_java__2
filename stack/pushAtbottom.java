import java.util.*;
public class pushAtbottom 
{
    public void pushbottom(Stack <Integer> s,int data)
    {
        if(s.isEmpty())
        {
            pushbottom(s,data);
            return;
        }
        int top = s.pop();
        pushbottom(s,data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        s.pushbottom(s,4);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
