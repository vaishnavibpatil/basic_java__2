import java.util.*;

public class Activity_sel_Unsorted 
{
    public static void main(String args[])
    {
       
        int start[] = {1,0,5,8,5,3};
        int end[] = {2,6,7,9,9,4};

        //if unsorted end
        int arr[][] = new int[start.length][3];
        for(int i=0;i<arr.length;i++)
        {
             arr[i][0]=i;
             arr[i][1]=start[i];
             arr[i][2] = end[i];
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
         

        //lambda function
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));
       
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        //for 1st activity
        maxAct = 1;
        ans.add(arr[0][0]);
        int Lastend = arr[0][2];

        for(int i=1;i<end.length;i++)
        {
            if(arr[i][1] >= Lastend)
            {
                //activity select
                maxAct++;
                ans.add(arr[i][0]);
                Lastend=arr[i][2];
            }
        }
        System.out.println("Max Activity = " + maxAct);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A" + ans.get(i) + " ");
        }
    }
    
}
