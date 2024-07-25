import java.util.*;
public class Activity_selection
{
    public static void main(String args[])
    {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        //for 1st activity
        maxAct = 1;
        ans.add(0);
        int Lastend = end[0];

        for(int i=1;i<end.length;i++)
        {
            if(start[i] >= Lastend)
            {
                //activity select
                maxAct++;
                ans.add(i);
                Lastend=end[i];
            }
        }
        System.out.println("Max Activity = " + maxAct);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A" + ans.get(i) + " ");
        }




    }
}