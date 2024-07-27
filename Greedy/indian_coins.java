import java.util.*;
public class indian_coins 
{
    public static void main(String args[])
    {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int amount = 567;
        int count = 0 ;

        for(int i=0;i<coins.length;i++)
        {
            while(coins[i] <= amount)
            {
                count++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
        }
        System.out.println("count of coins = " +count);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }
    

}
