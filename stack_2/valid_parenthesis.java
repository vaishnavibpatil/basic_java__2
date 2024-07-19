import java.util.*;
public class valid_parenthesis
{
    public static void valid(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length() ;i++)
        {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')

        }
    }
    public static void main(String args[])
    {
        String str = "{[()]}";
        valid(str);
    }
}